package jDBCAndMySQL;

import java.sql.*;

public class InsertItemsIntoMySQL {

	public static void main(String[] args) throws Exception {
				
		// You can insert items into MySQL with java, like you would do it in the MySQL Workbench:
		String url = "jdbc:mysql://127.0.0.1:3306/java";
		String username = "root";
		String password = "root";
		String query = "Insert into film value (4, 'Jurassic World', 2015, 150000000, Null, 'Science-Fiction/Abenteuer')";
		
		// Bei manchen Frameworks muss man auch noch die JDBC-MySQL-Treiber laden, 
		// das macht man mit diesm Befehl: Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		// important changes above
	
		System.out.println(count + "row/s affected"); 
		
		st.close();
		con.close();
		
		
		
		// or if the items are in saved in variables you can do this:		
		int FilmID = 5;
		String FilmName = "Fluch der Karibik 2";
		int Veröffentlichung = 2006;
		int Kosten = 225000000;
		String Genre = "Action/Abenteuer";
		
		
		String url2 = "jdbc:mysql://127.0.0.1:3306/java";
		String username2 = "root";
		String password2 = "root";
		String query2 = "Insert into film value (?, ?, ?, ?, null, ?)";
		
		// Class.forName("com.mysql.jdbc.Driver");
		Connection con2 = DriverManager.getConnection(url2, username2, password2);
		PreparedStatement st2 = con2.prepareStatement(query2);
		st2.setInt(1, FilmID);
		st2.setString(2, FilmName);
		st2.setInt(3, Veröffentlichung);
		st2.setInt(4, Kosten);
		st2.setString(5, Genre);
		int count2 = st2.executeUpdate();
		// important changes above
	
		System.out.println(count2 + "row/s affected"); 
		
		st2.close();
		con2.close();
		
		/*
		 * Bei Frameworks wie z.B. Apache Wicket muss man ein ORM (Object-rational Mapping)
		 * Benutzen. Das kann und sollte man bei Java mit Hibernate machen.
		 */
	}
	
}
