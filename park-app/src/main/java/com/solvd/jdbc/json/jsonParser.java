package com.solvd.jdbc.json;

public class jsonParser {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30,\"cars\":[\"Ford\",\"BMW\",\"Fiat\"]}";
        System.out.println(json);
        System.out.println(parseJson(json));
    }

    public static String parseJson(String json) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < json.length()) {
            char c = json.charAt(i);
            if (c == '{') {
                sb.append("\n");
                sb.append(c);
                sb.append("\n");
                i++;
                while (i < json.length()) {
                    c = json.charAt(i);
                    if (c == '}') {
                        sb.append(c);
                        sb.append("\n");
                        i++;
                        break;
                    } else if (c == '"') {
                        sb.append(c);
                        i++;
                        while (i < json.length()) {
                            c = json.charAt(i);
                            if (c == '"') {
                                sb.append(c);
                                i++;
                                break;
                            } else {
                                sb.append(c);
                                i++;
                            }
                        }
                    } else {
                        sb.append(c);
                        i++;
                    }
                }
            } else {
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }
    
}
