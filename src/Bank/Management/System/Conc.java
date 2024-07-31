package Bank.Management.System;

import java.sql.*
;
import java.sql.Statement;


public class Conc {
	Connection connection;
	
	Statement statement;
	public Conc(){
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","Ashish8328621135");
			statement = connection.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}





