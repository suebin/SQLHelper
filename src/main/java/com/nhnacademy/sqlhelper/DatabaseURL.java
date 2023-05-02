package com.nhnacademy.sqlhelper;

public class DatabaseURL {
    public static String MysqlDatabaseURL(String serverName, String databaseName) {
        return "jdbc:mysql://" + serverName + "/" + databaseName;
    }

    public static String MssqlDatabaseURL(String serverName, String databaseName) {
        return "jdbc:sqlserver://" + serverName + ";encrypt=true;trustServerCertificate=true;databaseName=" + databaseName;
    }
}
