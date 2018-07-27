package com.mysql;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public final class DBConnection {
	String driver = "com.mysql.jdbc.Driver";
    String url= "jdbc:mysql://localhost:3306/mydatabase01?useUnicode=true&characterEncoding=UTF-8";
    String user = "root";
    String password = "root";
    
    public Connection conn;

    public DBConnection() {

        try {
            Class.forName(driver);// ������������
            conn = (Connection) DriverManager.getConnection(url, user, password);// �������ݿ�
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void close() {
        try {
            this.conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
