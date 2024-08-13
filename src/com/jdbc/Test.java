package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author hyc
 * @date 2024/8/13
 * @version: 1.0
 */

public class Test {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 获取数据库连接
            connection = JDBCUtils.getConnection();
            System.out.println("Database connected successfully.");

            // 创建 SQL 查询语句
            String sql = "SELECT name FROM t1 WHERE id = 1";
            System.out.println("Executing query: " + sql);

            // 创建 Statement 对象
            statement = connection.createStatement();
            System.out.println("s");
            // 执行 SELECT 查询并获取结果集
            resultSet = statement.executeQuery(sql);

            // 处理结果集
            if (!resultSet.next()) {
                System.out.println("No results found.");
            } else {
                do {
                    String name = resultSet.getString("name");
                    System.out.println("Name: " + name);
                } while (resultSet.next());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭数据库资源
            JDBCUtils.close(connection, statement, resultSet);
        }
    }
}


