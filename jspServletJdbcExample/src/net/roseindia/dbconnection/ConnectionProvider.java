package net.roseindia.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class ConnectionProvider {

    private static Connection con = null;

    public static Connection getConnection() {
        if (con != null)
            return con;
        else {
            try {
            	
            	Class.forName("com.mysql.jdbc.Driver"); 
            	java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            	System.out.println("connected");
            	//java.sql.Statement st= con.createStatement(); 
            //	ResultSet rs=st.executeQuery("select * from prj1 where user='"+userid+"'"); 
                //
                /*String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/test";
                String user = "root";
                String password = "";
                Class.forName(driver);
                con = DriverManager.getConnection(url, user, password);
                System.out.println("connected");*/
            } catch (ClassNotFoundException cnfe) {
                System.out.println(cnfe);
            } catch (SQLException sqe) {
                System.out.println(sqe);
            } 
            return con;
        }

    }
}