package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//класс для подключения базы данных
public class Util {
        public static final String DB_URL = "jdbc:mysql://localhost:3306/";
        public static final String DB_USER_NAME = "root";
        public static final String DB_PASSWORD = "";

        public static Connection getConnection() {
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(DB_URL, DB_USER_NAME, DB_PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }

