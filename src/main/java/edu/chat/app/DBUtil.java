package edu.chat.app;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;;
import java.sql.Connection;

import java.sql.SQLException;

public class DBUtil {
    /**
     * JDBC Driver and database url
     */
    static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/chat_db";
    static final String USER = "postgres";
    static final String PASSWORD = "postgres";
    static final String DB_DRIVER = "org.postgresql.Driver";

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(DATABASE_URL);
        config.setUsername(USER);
        config.setPassword(PASSWORD);
        config.setDriverClassName(DB_DRIVER);
        dataSource = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }



}
