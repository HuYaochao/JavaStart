package com.jdbc.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        //1.�������ݿ����ӳض���
        DataSource ds = new ComboPooledDataSource();
        //2.��ȡ���Ӷ���
        Connection conn = ds.getConnection();
        //3.�����ӡ
        System.out.println(conn);
    }
}
