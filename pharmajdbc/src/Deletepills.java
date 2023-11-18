import java.sql.*;

public class Deletepills {
	public static void works() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/pharmacy";
		String username="root";
		String password="vickyvino";
		String Query="delete from pills where pillcode=333";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args) throws Exception{
		works();
	}

}

