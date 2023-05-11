package view;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForgetPassword
 */
@WebServlet("/ForgetPassword")
public class ForgetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ForgetPassword() {
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
				+ "	<html lang='fr'>"
				+ "		<head>"
				+ "			<meta charset='utf-8'>"
				+ "			<title>Mot de passe oublié</title>"
				+ "			<link rel='stylesheet' href='style/style.css' />\r\n"
				+ "		</head>"
				+ "		<body>"
				+ "			<header>"
				+ "				<img src='image/do_you_speak_english_flag.png' title='logo'>"
				+ "			</header>"
				+ "			<main>"
				+ "				<h1>Mot de passe oublié</h1>"
				+ "				<form method='POST' action='VerifUser'>"
				+ "					<input type='hidden' name='formCheck' value='ForgetPassword'/>"
				+ "					Identifiant <input type=\"text\" name=\"name\" />"
				+ "					Nouveau mot de passe <input type=\"password\" name=\"password\" />"
				+ "					Confirmer le nouveau mot de passe <input type=\"password\" name=\"passwordVerif\" />"
				+ "					Date de naissance (JJ-MM-AAAA) <input type=\"text\" name=\"birthDate\" />"
				+ "					<input type='submit' name='submitPass' value='Valider' />"
				+ "					<input type='reset' name='buttonClear' value='Effacer' />"
				+ "				</form>"
				+ "				<form method='POST' name='swapMainPage' action='SwapPage'>"
				+ "					<input type='hidden' name='buttonValue' value='MainPage' />"
				+ "					<input type='submit' name='MainPage' value='Accueil' />"
				+ "				</form>"
				+ "				<form method='POST' name='swapLogIn' action='SwapPage'>"
				+ "					<input type='hidden' name='buttonValue' value='LogIn' />"
				+ "					<input type='submit' name='LogIn' value='Connexion' />"
				+ "				</form>"
				+ "			</main>"
				+ "		</body>"
				+ "	</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
