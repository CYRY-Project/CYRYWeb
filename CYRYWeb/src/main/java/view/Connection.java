package view;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Connection
 */
@WebServlet("/Connection")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Connection() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>"
				+ "<html lang='fr'>"
				+ "	<head>"
				+ "		<meta charset='utf-8'>"
				+ "		<title>Connexion</title>"
				+ "		<link rel='stylesheet' href='style/style.css' />\r\n"
				+ "	</head>"
				+ "	<body>"
				+ "		<header>"
				+ "			<img src='image/do_you_speak_english_flag.png' title='logo'>"
				+ "		</header>"
				+ "		<main>"
				+ "			<form name='formLogIn' method='POST' action='VerifUser'>"
				+ "				<input type='hidden' name='formCheck' value='LogIn' />"
				+ "				<h1>Connexion</h1>"
				+ "				<p>Identifiant</p>"
				+ "				<input type='text' name='name' />"
				+ "				<p>Mot de passe</p>"
				+ "				<input type='password' name='password' />"
				+ "				<input type='submit' name='confirm' value='Valider' />"
				+ "			</form>"
				+ "			<form method='POST' name='swapMainPage' action='SwapPage'>"
				+ "				<input type='hidden' name='buttonValue' value='MainPage' />"
				+ "				<input type='submit' name='MainPage' value='Accueil'/>"
				+ "			</form>"
				+ "			<form method='POST' name='swapForgetPassword' action='SwapPage'>"
				+ "				<input type='hidden' name='buttonValue' value='ForgetPassword' />"
				+ "				<input type='submit' name='ForgetPassword' value='Mot de passe perdu' />"
				+ "			</form>"
				+ "			<form method='POST' name='swapSignIn' action='SwapPage'>"
				+ "				<input type='hidden' name='buttonValue' value='SignIn' />"
				+ "				<input type='submit' name='SignIn' value='Inscription' />"
				+ "			</form>"
				+ "		</main>"
				+ "	</body>"
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
