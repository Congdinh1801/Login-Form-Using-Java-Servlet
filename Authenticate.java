package AuthenticationServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authenticate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String buttonClicked = request.getParameter("buttonSubmit");
		
		if(username.contentEquals("user") && password.contentEquals("pw") && buttonClicked != null) {
			response.getWriter().append("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Home Page</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					" You logged in successfully\r\n" + 
					" <a href=\"http://localhost:8083/authen/index.html\">Return to\r\n" + 
					"		log in page</a>\r\n" + 
					"</body>\r\n" + 
					"</html>");
		}
		else {
			response.getWriter().append("<!DOCTYPE html>\r\n" + 
					"<html>\r\n" + 
					"<head>\r\n" + 
					"<meta charset=\"ISO-8859-1\">\r\n" + 
					"<title>Log in page</title>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"	<form action=\"http://localhost:8083/authen/Authenticate\" method=\"post\">\r\n" + 
					"		<table>\r\n" + 
					"			<tr>\r\n" + 
					"				<td><label>User name</label></td>\r\n" + 
					"				<td><input type=\"text\" name=\"username\" required></td>\r\n" + 
					"			</tr>\r\n" + 
					"			<tr>\r\n" + 
					"				<td><label>Password</label></td>\r\n" + 
					"				<td> <input type=\"password\" name=\"password\" required></td>\r\n" + 
					"			</tr>\r\n" + 
					"			<tr>\r\n" + 
					"				<td> <input type=\"submit\" value=\"Login\" name=\"buttonSubmit\"></td>\r\n" + 
					"			</tr>\r\n" + 
					"		</table>\r\n" + 
					"		\r\n" + 
					"	</form>\r\n" + 
					"Wrong username or password!\r\n" + 
					"</body>\r\n" + 
					"</html>");
		}
		
	}

}
