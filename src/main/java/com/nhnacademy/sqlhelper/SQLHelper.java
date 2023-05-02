package com.nhnacademy.sqlhelper;

import java.sql.*;
import java.util.List;

public class SQLHelper<T> {
    List<T> dataList;

    private final DriverName driverName;
    private final String databaseURL;
    private final String userName;
    private final String password;

    public SQLHelper(DriverName driverName, String databaseURL, String userName, String password) {
        this.driverName = driverName;
        this.databaseURL = databaseURL;
        this.userName = userName;
        this.password = password;
    }

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet result = null;

    public void connect() {
        try {
            Class.forName(driverName.getDriverName());
            connection = DriverManager.getConnection(databaseURL, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public List<T> selectAllData(String tableName, Class<T> clazz) {
        try {
            this.connect();
            String sqlQuery = "SELECT * FROM " + tableName;
            statement = connection.prepareStatement(sqlQuery);
            result = statement.executeQuery();


            while(result.next()) {
                for (int i = 1; i < result.getMetaData().getColumnCount(); i++) {
                    System.out.println(result.getMetaData().getColumnName(i) + result.getObject(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this.dataList;
    }
}
