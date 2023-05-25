import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/feedback_form")
public class feedback_form extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhyaz","root","Akku123$");
			
			String u = request.getParameter("uname");
			String e = request.getParameter("email");
			String f = request.getParameter("fdbk");

			PreparedStatement ps = con.prepareStatement("insert into feedback_data(username, email_id, feedback)" + "values(?,?,?)");
			ps.setString(1, u);
			ps.setString(2, e);
			ps.setString(3, f);
			
			int rs = ps.executeUpdate();
			
			if(rs > 0)
			{
				response.sendRedirect("success.html");
			}
			else
			{
				response.sendRedirect("error.html");
			}
		}
		catch(Exception e){
			response.sendRedirect("error.html");
		}
	}

}
