package com.kpbs.db;


import com.kpbs.AppContext;
import org.apache.log4j.Logger;
import org.apache.tomcat.dbcp.dbcp.ConnectionFactory;
import org.apache.tomcat.dbcp.dbcp.DriverManagerConnectionFactory;
import org.apache.tomcat.dbcp.dbcp.PoolableConnectionFactory;
import org.apache.tomcat.dbcp.dbcp.PoolingDataSource;
import org.apache.tomcat.dbcp.pool.impl.GenericObjectPool;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPoolSingleton {
    private static final Logger Log = Logger.getLogger(ConnectionPoolSingleton.class);
    private static ConnectionPoolSingleton instance = null;
    private static GenericObjectPool gPool = null;
    private static String JDBC_DRIVER = "org.postgresql.Driver";
    private static String JDBC_DB_URL;
    private static String JDBC_USER;
    private static String JDBC_PASS;
    private static PoolingDataSource poolingDataSource;


    public static synchronized ConnectionPoolSingleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConnectionPoolSingleton();
            try {
                instance.setUp();
            } catch (Exception e) {
                Log.error("ConnectionPool setup failed", e);
                throw new SQLException("Can't initialize connection pool");
            }
        }
        return instance;
    }
    public void setUp() throws ClassNotFoundException {
        setJDBSParameters();
        Class.forName(JDBC_DRIVER);
        gPool = new GenericObjectPool();
        gPool.setMaxActive(5);
        ConnectionFactory cf = new DriverManagerConnectionFactory(JDBC_DB_URL, JDBC_USER, JDBC_PASS);
        new PoolableConnectionFactory(cf, gPool, null, null, false, true);
        poolingDataSource = new PoolingDataSource (gPool);
    }
    private GenericObjectPool getConnectionPool() {
        return gPool;
    }

    public static Connection getConnection() throws SQLException {
        if (getInstance().poolingDataSource == null)
            throw new SQLException("poolingDataSource Error occured");
        Connection connection = getInstance().poolingDataSource.getConnection();
        if(connection == null)
            throw new SQLException("Can't get connection");
        return connection;
    }

    private void printDbStatus() {
        Log.debug("Max.: " + getConnectionPool().getMaxActive() + "; Active: " + getConnectionPool().getNumActive() + "; Idle: " + getConnectionPool().getNumIdle());
    }

    private void setJDBSParameters(){
        JDBC_DB_URL = AppContext.getProperty("database.url");
        JDBC_USER = AppContext.getProperty("database.login");
        JDBC_PASS = AppContext.getProperty("database.password");
    }


}
