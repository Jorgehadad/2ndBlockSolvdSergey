package com.solvd.jdbc.connections;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Consumer;

public class ConnectionPool {
    private static ConnectionPool connectionPool;
    private static final int MAX_CONNECTION_SIZE = 5;
    private static LinkedBlockingQueue<Connection> connections;
    private static int connectionCount = 0;

    private ConnectionPool(){
        connections = new LinkedBlockingQueue<Connection>(MAX_CONNECTION_SIZE);
    }

    public static ConnectionPool getInstance(){
        if (connectionPool == null){
            connectionPool = new ConnectionPool();
        }
        return connectionPool;
    }

    private synchronized void newConnection(){
        connections
                .add(new Connection(connectionCount));
        connectionCount++;
    }

    public Connection getConnection() throws InterruptedException {
        if (connectionCount < MAX_CONNECTION_SIZE){
            newConnection();
        }
        return connections.take();
    }


    public void add(Connection conn){
        connections.offer(conn);
    }
    public void freeConnection(Connection connection) throws InterruptedException {
        connections.put(connection);
    }
    public void backConnection(Connection connection){
        connections.offer(connection);
    }
    public static Integer getMaxConnectionsSize(){
        return MAX_CONNECTION_SIZE;
    }

    public void closeConnections(){
        connections.forEach(new Consumer<Connection>() {
            @Override
            public void accept(Connection conn) {
                try {
                    conn.closeConnection();
                } 
                catch (InterruptedException exception) {
                }
            }
        });
        connections = new LinkedBlockingQueue<Connection>(MAX_CONNECTION_SIZE);
        connectionCount = 0;
    }


}
