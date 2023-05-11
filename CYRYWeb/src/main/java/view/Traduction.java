package view;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

/**
 * Servlet implementation class Traduction
 */
@WebServlet("/Traduction")
public class Traduction extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Traduction() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>"
				+ "	<html lang='fr'>"
				+ "		<head>"
				+ "			<meta charset=\"utf-8\">"
				+ "			<title>Traduction</title>"
				+ "			<link rel=\"stylesheet\" href=\"style/style.css\" />"
				+ "		</head>"
				+ "		<body>"
				+ "			<header>"
				+ "				<form method='POST' action='SwapPage'>"
				+ "					<input type='hidden' name='buttonValue' value='Account' />"
				+ "					<button type=\"submit\" name=\"accountUser\"><img src=\"" + ((User)session.getAttribute("user")).getUserAvatar() + "\" alt=\"avatar\"></button>"
				+ "				</form>"
				+ "				<h1 class=\"home-id\">" + ((User)session.getAttribute("user")).getUserName() + "</h1>"
				+ "				<h2 class=\"home-level\">Level : " + ((User)session.getAttribute("user")).getUserLevel() + "</h2>"
				+ "				<h2 class=\"home-score\">Points : " + ((User)session.getAttribute("user")).getUserPoints() + "</h2>"
				+ "				<form method='POST' action='SwapPage'>"
				+ "					<input type='hidden' name='buttonValue' value='Menu' />"
				+ "					<input type=\"submit\" value=\"menu\" />"
				+ "				</form>"
				+ "			</header>"
				+ "			<main>"
				+ "				<div class=\"account\">"
				+ "					"
				+ "				</div>"
				+ "				<div class=\"menu\">"
				+ "					"
				+ "				</div>"
				+ "				<div class=\"content\">"
				+ "					<h1>Titre de l'exercice</h1>"
				+ "					<div name=\"traduction\">"
				+ "						<button type=\"button\" name=\"question1\">Question 1</button>"
				+ "						<button type=\"button\" name=\"question2\">Question 2</button>"
				+ "						<button type=\"button\" name=\"question2\">Question 3</button>"
				+ "						<button type=\"button\" name=\"question2\">Question 4</button>"
				+ "						<button type=\"button\" name=\"question2\">Question 5</button>"
				+ "						<input type=\"text\" name=\"questionChoosen\">"
				+ "						<input type=\"text\" name=\"answerChoosen\">"
				+ "						<button type=\"button\" name=\"confirmChoice\">Vérouiller</button>"
				+ "						<button type=\"button\" name=\"answer1\">Réponse 1</button>"
				+ "						<button type=\"button\" name=\"answer2\">Réponse 2</button>"
				+ "						<button type=\"button\" name=\"answer3\">Réponse 3</button>"
				+ "						<button type=\"button\" name=\"answer4\">Réponse 4</button>"
				+ "						<button type=\"button\" name=\"answer5\">Réponse 5</button>"
				+ "					</div>"
				+ "					<button type=\"button\" name=\"rule\">Règles</button>"
				+ "					<button type=\"button\" name=\"reset\">Réinitialiser</button>"
				+ "					<button type=\"button\" name=\"confirm\">Valider</button>"
				+ "					<button type=\"button\" name=\"exit\">Quitter</button>"
				+ "				</div>"
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
