package movies;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;

public class Movies {
	
	public static void main(String args[])
	{
		try
	    {
		      Class.forName("com.mysql.jdbc.Driver");
	      String myUrl = "jdbc:mysql://localhost:3306/mca";
	      Connection conn = DriverManager.getConnection(myUrl, "root", "root");

	      String query = " insert into users (movie_name, Actor, Actress, year_of_release, Director)"
	        + " values (?, ?, ?, ?, ?)";
	      
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setString (1, "Kushi");
	      preparedStmt.setString (2, "Pawan kalyan");
	      preparedStmt.setString (2, "Bhumika");
	      preparedStmt.setInt    (5, 2001);
	      preparedStmt.setString (2, "Surya");
	      preparedStmt.execute();
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
		
	}
}
