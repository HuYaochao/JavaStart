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
//           ���������ļ�
           Properties properties = new Properties();
           InputStream input = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
           if(input ==null){
               throw new RuntimeException("Unable to find jdbc.properties");
           }
           properties.load(input);

           // �������ļ��ж�ȡ����
           driver = properties.getProperty("jdbc.driver");
           url = properties.getProperty("jdbc.url");
           user = properties.getProperty("jdbc.user");
           password = properties.getProperty("jdbc.password");

           // ���� JDBC ����
           Class.forName(driver);

       } catch (IOException | ClassNotFoundException e) {
           throw new RuntimeException(e);
       }
    }

    // ��ȡ���ݿ�����
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    // �ر����ݿ���Դ
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

    // �ر����ݿ���Դ��û�� ResultSet��
    public static void close(Connection connection, Statement statement) {
        close(connection, statement, null);
    }
}
