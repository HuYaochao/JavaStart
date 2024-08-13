package com.jdbc.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
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

public class DruidUtils {

    private static DataSource dataSource;

    static {
        try {
            Properties properties = new Properties();
            InputStream input = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            if (input == null) {
                throw new RuntimeException("Unable to find druid.properties");
            }
            properties.load(input);

            // ��ʼ�� Druid ����Դ
            dataSource = DruidDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
    }

    // ��ȡ���ݿ�����
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
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
