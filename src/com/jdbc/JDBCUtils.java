package com.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author hyc
 * @date 2024/8/13
 * @version: 1.0
 */

public class JDBCUtils {
    private  static  String url;
    private  static  String user;
    private  static  String password;
    private  static  String driver;

    static {
       try {
//           加载属性文件
           Properties properties = new Properties();
           InputStream input = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
           if(input ==null){
               throw new RuntimeException("Unable to find jdbc.properties");
           }
           properties.load(input);

           // 从属性文件中读取配置
           driver = properties.getProperty("jdbc.driver");
           url = properties.getProperty("jdbc.url");
           user = properties.getProperty("jdbc.user");
           password = properties.getProperty("jdbc.password");

           // 加载 JDBC 驱动
           Class.forName(driver);

       } catch (IOException | ClassNotFoundException e) {
           throw new RuntimeException(e);
       }
    }

    // 获取数据库连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    // 关闭数据库资源
    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 关闭数据库资源（没有 ResultSet）
    public static void close(Connection connection, Statement statement) {
        close(connection, statement, null);
    }
}
