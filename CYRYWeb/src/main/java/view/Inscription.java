package view;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Inscription
 */
@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Inscription() {
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
				+ "		<meta charset='UTF-8' />"
				+ "		<title>Inscription</title>"
				+ "		<link rel='stylesheet' href='style/style.css' />"
				+ "	</head>"
				+ "	<body>"
				+ "		<img src='image/do_you_speak_english_flag.png' alt='do_you_speak_english' />"
				+ "		<h1>Inscription</h1>"
				+ "		<form name='formSignIn' method='POST' action='VerifUser'>"
				+ "			<input type='hidden' name='formCheck' value='SignIn' />"
				+ "			Identifiant <input type='text' name='name' />"
				+ "			Mot de passe <input type='password' name='password' />"
				+ "			Confirmer le mot de passe <input type='password' name='passwordVerif' />"
				+ "			Date de naissance (JJ-MM-AAAA) <input type='text' name='birthDate'>"
				+ "			<input type='submit' name='confirm' value='Valider' />"
				+ "			<button type='reset' name='clearForm'>Effacer</button>"
				+ " 	</form>"
				+ "		<form method='POST' name='swapMainPage' action='SwapPage'>"
				+ "			<input type='hidden' name='buttonValue' value='MainPage' />"
				+ "			<input type='submit' name='MainPage' value='Accueil'/>"
				+ "		</form>"
				+ "		<form method='POST' name='swapLogIn' action='SwapPage'>"
				+ "			<input type='hidden' name='buttonValue' value='LogIn' />"
				+ "			<input type='submit' name='LogIn' value='Connexion' />"
				+ "		</form>"
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