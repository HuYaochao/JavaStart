package com.jdbc.druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author hyc
 * @date 2024/8/13
 * @version: 1.0
 */

public class UserService {

    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // 1.��������
            conn = DruidUtils.getConnection();
            // 2.����sql
            String sql = "SELECT username, password FROM t2 WHERE username = ? AND password = ?";
            // 3.��ȡִ��sql�Ķ���
            pstmt = conn.prepareStatement(sql);
            // 3.1.���θ� ���Ÿ�ֵ
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            // 4.ִ�в�ѯ
            rs = pstmt.executeQuery();
            // 5.�ж�
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // �ر���Դ
            DruidUtils.close(conn, pstmt, rs);
        }

        return false;
    }

    // �����û�
    public boolean addUser(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DruidUtils.getConnection();
            String sql = "INSERT INTO t2(username, password) VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DruidUtils.close(conn, pstmt);
        }
        return false;
    }

    // ɾ���û�
    public boolean deleteUser(String username) {
        if (username == null) {
            return false;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DruidUtils.getConnection();
            String sql = "DELETE FROM t2 WHERE username = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DruidUtils.close(conn, pstmt);
        }
        return false;
    }

    // �����û�����
    public boolean updateUserPassword(String username, String newPassword) {
        if (username == null || newPassword == null) {
            return false;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DruidUtils.getConnection();
            String sql = "UPDATE t2 SET password = ? WHERE username = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newPassword);
            pstmt.setString(2, username);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DruidUtils.close(conn, pstmt);
        }
        return false;
    }
}
