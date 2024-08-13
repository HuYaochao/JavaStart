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

            // 初始化 Druid 数据源
            dataSource = DruidDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
    }

    // 获取数据库连接
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
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
