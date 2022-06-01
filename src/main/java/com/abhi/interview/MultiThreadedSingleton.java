package com.abhi.interview;

public class MultiThreadedSingleton {
    public static void main(String[] args) {
        DbConnection dbConnection1 = DbConnection.getInstance();
        DbConnection dbConnection2 = DbConnection.getInstance();

        System.out.println(dbConnection1 == dbConnection2);
    }
}

class DbConnection {
    private static volatile DbConnection dbConnection;
    private static Object mutex = new Object();

    private DbConnection() {}

    public static DbConnection getInstance() {
        DbConnection con = dbConnection;
        if (con == null) {
            synchronized (mutex) {
                con = dbConnection;
                if (con == null) {
                    dbConnection = new DbConnection();
                }
            }

        }
        return dbConnection;
    }
}
