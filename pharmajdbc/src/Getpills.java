import java.sql.*;

public class Getpills {

	public static void works() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/pharmacy";
		String username="root";
		String password="vickyvino";
		String Query="select * from pills";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement smt=con.createStatement();
		ResultSet rs=smt.executeQuery(Query);
		while(rs.next()) {
			System.out.println("pillcode"+rs.getInt(1));
			System.out.println("name"+rs.getString(2));
			System.out.println("uses"+rs.getString(3));
			System.out.println("sideeffects"+rs.getString(4));
						
		}
		con.close();
	}
	public static void main(String[]args) throws Exception{
		works();
	}
}

