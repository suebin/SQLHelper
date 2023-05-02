package com.nhnacademy.sqlhelper.test;

import com.nhnacademy.sqlhelper.DatabaseURL;
import com.nhnacademy.sqlhelper.DriverName;
import com.nhnacademy.sqlhelper.SQLHelper;

/**
 * Passenger Class 로 SQL Helper 테스트.
 */
public class Test {
    public static void main(String[] args) {
        SQLHelper helper = new SQLHelper(DriverName.MYSQL,
                DatabaseURL.MysqlDatabaseURL("localhost", "Module06"),
                "root", "9011");

        helper.selectAllData("Passenger", Passenger.class);
    }
}
