package com.nhnacademy.sqlhelper;

public enum DriverName {
    MYSQL("com.mysql.cj.jdbc.Driver"),
    MSSQL("com.microsoft.sqlserver.jdbc.SQLServerDriver"),
    ORACLE("oracle.jdbc.driver.OracleDriver");

    private final String name;

    DriverName(String name) {
        this.name = name;
    }

    public String getDriverName() {
        return name;
    }
}
