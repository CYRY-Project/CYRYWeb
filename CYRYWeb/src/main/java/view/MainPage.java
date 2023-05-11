package view;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainPage
 */
@WebServlet("/MainPage")
public class MainPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MainPage() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "	<head>\r\n"
				+ "		<meta charset=\"utf-8\">\r\n"
				+ "		<title>Page Principale</title>\r\n"
				+ "		<link rel=\"stylesheet\" href=\"style/style.css\" />\r\n"
				+ "	</head>\r\n"
				+ "	<body>\r\n"
				+ "		<header>\r\n"
				+ "			<img src=\"image/do_you_speak_english_flag.png\" title=\"logo\"/>\r\n"
				+ "		</header>\r\n"
				+ "		<h1>Accueil</h1>\r\n"
				+ "		<form method='POST' action='SwapPage' name='formLogIn'>"
				+ "			<input type='hidden' name='buttonValue' value='LogIn' />" 
				+ "			<input type='submit' name='Connexion' value='Connexion' />"
				+ "		</form>"
				+ "		<form method='POST' action='SwapPage' name='formSignIn'>"
				+ "			<input type='hidden' name='buttonValue' value='SignIn' />"
				+ "			<input type='submit' name='Inscription' value='Inscription' />"
				+ "		</form>"
				+ "	</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
