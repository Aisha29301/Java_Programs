import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// This class helps in connecting to employee database through JDBC Code
public class EmployeeDAO { //Employee DAO is Data Access Object which separates 
//	It contains methods for operating CRUD operations on employeetable from database
	String dbDriver = "com.mysql.cj.jdbc.Driver";
	String dbURL = "jdbc:mysql://localhost:3307/aishwarya";
	String userName = "root";
	String pwd = "password";
	Connection dbCon = null;
	
	private boolean connectToDtbc() throws SQLException,ClassNotFoundException{
		Class.forName(dbDriver); //ClassNotFoundException
		dbCon = DriverManager.getConnection(dbURL,userName,pwd); //SQLException
		System.out.println("inside connectToDtbc()");
		return true;
	}
	public boolean insertRecord(Employee empObj) {
		String insertQueryStr = "insert into employeetable values(?,?,?,?,?,?,?);";
		try {
			if(connectToDtbc()) {
//				System.out.println("Connection Established successfully "+connectToDtbc());
				PreparedStatement ppstmt = dbCon.prepareStatement(insertQueryStr);
				ppstmt.setInt(1, empObj.getEmpid());
				ppstmt.setString(2, empObj.getEmpFirstName());
				ppstmt.setString(3, empObj.getEmpMdName());
				ppstmt.setString(4, empObj.getEmpLastName());
				ppstmt.setInt(5, empObj.getEmpAge());
				ppstmt.setString(6, empObj.getEmpDept());
				ppstmt.setString(7,empObj.getEmpAddr());
//				System.out.println("query about to execute");
				ppstmt.executeUpdate(); //executeUpdate() for non-select,insert,delete,update
//				System.out.println("Query Executed");
				ppstmt.close();
				dbCon.close();
				return true;
			}
			System.out.println("Connection not established");
			return false;
		}catch(Exception e) {
			return false;
		}
	}
}
