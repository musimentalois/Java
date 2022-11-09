   package Collegebackend.lois;

import java.sql.*;


public class MysqlCon {
	
	public static void main(String args[]){
	    try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con=DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/ems","loic", "Abcd@2020");

	        Statement stmt=con.createStatement();
	        ResultSet rs=stmt.executeQuery("select * from students-+");
	        while(rs.next())
	            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
	        con.close();
	    }catch(Exception e){ System.out.println(e);}
	}

}
