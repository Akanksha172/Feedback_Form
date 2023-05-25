package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class submit {
	String url="jdbc:mysql://localhost:3306/abhyaz";
	String uname="root";
	String pw="Akku123$";
	public boolean check(String username, String password) throws SQLException
	{
		String sql="select * from index where username=? and password=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pw);
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
		
	}
}