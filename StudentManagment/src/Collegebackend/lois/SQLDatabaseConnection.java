package Collegebackend.lois;

//import java.sql.Connection;

import java.sql.*;

import college.ResultSet;
import college.Statement;

public class SQLDatabaseConnection {

    public static void main(String[] args) {
    	
//        String connectionUrl =
//                "jdbc:sqlserver://localhost.ems.windows.net:1433;"
//                        + "database=ems;"
//                        + "user=loic@localhost;"
//                        + "password=Abcd@2020;"
//                        + "encrypt=true;"
//                        + "trustServerCertificate=false;"
//                        + "loginTimeout=30;";
    	
    	
        
//         ResultSet resultSet = null;-

//        try (
//        		connection connection = DriverManager.getConnection(connectionUrl);
//        		               
//        		               
//        	Statement statement	 =  connection.createStatement();             
//        		) {
//            String selectSql = "select * from ems";
//          
//			resultSet = statement.executeQuery(selectSql);
//            
//            while(resultSet.next()) {
//            	System.out.println(resultSet.getString(2)+""+resultSet.getString(3));
//            }
//            
//        }
//        // Handle any errors that may have occurred.
//        catch (Exception e) {
//            e.printStackTrace();
//        }finally{
//        	connection.close();
//        	statement.close();
//        
//        }
    	
//    	try {
//    		Class.forName("com.mysql.cj.jdbc.Driver");
//    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMS","loic" , "Abcd@2020");
//    		
//    		Statement stmt  = con.createStatement();
//    		ResultSet res = stmt.executeQuery("select * from student");
//    		while(res.next())
//    			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
////    		con.close();
//    	}catch (Exception e){
//    		System.out.println(e);
//    		
//    	}
//    	finally {
//    		con.close();
//    	}
    	
    	
    	try {
    		  Class.forName("com.mysql.cj.jdbc.Driver");
    		    Connection con=DriverManager.getConnection(
    		            "jdbc:mysql://localhost:3306/Java_DB","loic", "Abcd@2020");

    		    Statement stmt=con.createStatement();
    		    ResultSet rs=stmt.executeQuery("select * from User");
    		    while(rs.next())
    		        System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
    		    con.close();
    		}catch(Exception e){ System.out.println(e);}
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}