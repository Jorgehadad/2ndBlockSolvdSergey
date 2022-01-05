package com.solvd.jdbc.connections;

public class Connection {
    private int id;

    public Connection(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void doSomething() throws InterruptedException {
        wait(2000);
    }

    public void closeConnection() throws InterruptedException {
        ConnectionPool
                .getInstance()
                .freeConnection(this);
    }
}
