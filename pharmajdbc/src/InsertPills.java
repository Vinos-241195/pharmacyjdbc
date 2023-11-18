import java.sql.*;

public class InsertPills {
	public static void insert()throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/pharmacy";
		String username="root";
		String password="vickyvino";
		String Query="insert into pills values(?,?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, 555);
		pst.setString(2,"Omeprazole");
		pst.setString(3,"Stomach Ache");
		pst.setString(4,"Constipation");
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[]args) throws Exception{
		insert();
	}

}


