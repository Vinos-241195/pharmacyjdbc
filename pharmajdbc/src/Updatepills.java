import java.sql.*;
public class Updatepills {
	public static void works() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/pharmacy";
		String username="root";
		String password="vickyvino";
		String Query="update pills set sideeffects='vommitting' where pillcode=111";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args) throws Exception{
		works();
	}

}

