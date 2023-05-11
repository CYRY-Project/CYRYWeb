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
 * Servlet implementation class Situation
 */
@WebServlet("/Situation")
public class Situation extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Situation() {
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
				+ "			<title>Situation</title>"
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
				+ "					<h1>Question ?</h1>"
				+ "					<form>"
				+ "						<button type=\"button\" name=\"buttonAnswer1\" value=\"answer1\"><img src=\"../../image/exercise/animal1.png\" alt=\"Réponse 1\"></button>\r\n"
				+ "						<button type=\"button\" name=\"buttonAnswer2\" value=\"answer2\"><img src=\"../../image/exercise/animal2.png\" alt=\"Réponse 2\"></button>\r\n"
				+ "						<button type=\"button\" name=\"buttonAnswer3\" value=\"answer3\"><img src=\"../../image/exercise/animal3.png\" alt=\"Réponse 3\"></button>\r\n"
				+ "						<button type=\"button\" name=\"buttonAnswer4\" value=\"answer4\"><img src=\"../../image/exercise/animal4.png\" alt=\"Réponse 4\"></button>\r\n"
				+ "						<button type=\"submit\" name=\"buttonConfirm\">Valider</button>"
				+ "					</form>"
				+ "					<button type=\"button\" name=\"buttonRules\">Règles</button> <button type=\"button\" name=\"buttonQuit\">Quitter</button>"
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
