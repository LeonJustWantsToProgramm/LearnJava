package jDBCAndMySQL;

import java.sql.*;

public class SingleItemInMySQL {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://127.0.0.1:3306/java";
		String username = "root";
		String password = "root";
		String query = "select Name from film where Name like 'Fl%'";
		
		// Bei manchen Frameworks muss man auch noch die JDBC-MySQL-Treiber laden, 
		// das macht man mit diesm Befehl: Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
	
		rs.next();			// Auswahl einer Spalte
		String name = rs.getString("Name");
		
		System.out.println(name);
		
		st.close();
		con.close();
		
		/*
		 * Bei Apache Wicket muss man jedoch noch ein ORM (Object-rational Mapping)
		 * Benutzen. Das kann und sollte man bei Java mit Hibernate machen.
		 */
	}
}
