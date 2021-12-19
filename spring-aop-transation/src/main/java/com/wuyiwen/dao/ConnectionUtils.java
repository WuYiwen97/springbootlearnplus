package com.wuyiwen.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {

    private ComboPooledDataSource dataSource;

    public void setDataSource(ComboPooledDataSource dataSource) {
        this.dataSource = dataSource;
    }


    public Connection getThreadConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        return connection;
    }

    public void removeConnection() {
        dataSource.close();
    }
}
