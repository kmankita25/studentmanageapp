package com.anki;

import java.sql.Connection;
import java.sql.DriverManager;
class CP {
    static Connection con;
    public static Connection createC()
    {
        try
        {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Create Connection
            String user = "root";
            String password = "Ankita@221715";
            String url = "jdbc:mysql://localhost:3306/student_manage?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false";
            con = DriverManager.getConnection(url,user,password);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }

}