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
            // ��ȡ���ݿ�����
            connection = JDBCUtils.getConnection();
            System.out.println("Database connected successfully.");

            // ���� SQL ��ѯ���
            String sql = "SELECT name FROM t1 WHERE id = 1";
            System.out.println("Executing query: " + sql);

            // ���� Statement ����
            statement = connection.createStatement();
            System.out.println("s");
            // ִ�� SELECT ��ѯ����ȡ�����
            resultSet = statement.executeQuery(sql);

            // ��������
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
            // �ر����ݿ���Դ
            JDBCUtils.close(connection, statement, resultSet);
        }
    }
}


