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
            // 1.建立连接
            conn = DruidUtils.getConnection();
            // 2.定义sql
            String sql = "SELECT username, password FROM t2 WHERE username = ? AND password = ?";
            // 3.获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
            // 3.1.依次给 ？号赋值
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            // 4.执行查询
            rs = pstmt.executeQuery();
            // 5.判断
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            DruidUtils.close(conn, pstmt, rs);
        }

        return false;
    }

    // 增加用户
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

    // 删除用户
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

    // 更新用户密码
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
