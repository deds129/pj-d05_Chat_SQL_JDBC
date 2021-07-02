package edu.chat.app;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
public class DBUtil {
    static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/chat_db";
    static final String USER = "postgres";
    static final String PASSWORD = "postgres";
    static final String DB_DRIVER = "org.postgresql.Driver";

   private static final HikariConfig config = new HikariConfig();
    static {
        config.setJdbcUrl(DATABASE_URL);
        config.setUsername(USER);
        config.setPassword(PASSWORD);
        config.setDriverClassName(DB_DRIVER);
    }

    public static DataSource getDataSource()  {
        return new HikariDataSource(config);
    }
}
