package jDBCAndMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MultipleItemsInMySQL {

	public static void main(String[] args) throws Exception {
		
		// You can do it like that if you only want a specific number of items:
		String url = "jdbc:mysql://127.0.0.1:3306/java";
		String username = "root";
		String password = "root";
		String query = "select * from film";
		
		// Bei manchen Frameworks muss man auch noch die JDBC-MySQL-Treiber laden, 
		// das macht man mit diesem Befehl: Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String Data = "";
		
		rs.next();			// Auswahl von Spalten
		Data = rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3);
		// You can copy the text from above when you need to display more columns
		
		System.out.println(Data);
		
		//rs.next goes down one column in the MySQL table
		rs.next();
		Data = rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getInt(3);
		
		System.out.println(Data + "\n");
		
		st.close();
		con.close();
		
		
		
		//or like that if you want to display all items available in the table:
		String url2 = "jdbc:mysql://127.0.0.1:3306/java";
		String username2 = "root";
		String password2 = "root";
		String query2 = "select * from film";
		
		//
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con2 = DriverManager.getConnection(url2, username2, password2);
		Statement st2 = con2.createStatement();
		ResultSet rs2= st2.executeQuery(query2);
		
		
		while(rs2.next()) {							// Auswahl von Spalten
			String Data2 = rs2.getInt(1) + " | " + rs2.getString(2) + " | " + rs2.getInt(3) + " | " + rs2.getInt(4)  + " | " + rs2.getString(6);
		
			System.out.println(Data2);
		}
		st2.close();
		con2.close(); 
		
		/*
		 * Bei z.B. Apache Wicket muss man noch ORM (Object-rational Mapping)
		 * Benutzen. Das kann und sollte man bei Java mit Hibernate machen.
		 */
	}

}