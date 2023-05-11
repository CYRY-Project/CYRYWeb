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
 * Servlet implementation class GapFillText
 */
@WebServlet("/GapFillText")
public class GapFillText extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GapFillText() {
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
				+ "			<title>Texte à trous</title>"
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
				+ "					<h1>Remplis les trous / Fill the Gap</h1>\r\n"
				+ "					<p>"
				+ "						Ea qui culpa laboris duis id aliqua\r\n"
				+ "						<select name=\"select1\" value=\"\">\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "						</select>\r\n"
				+ "					</p>"
				+ "					<p>"
				+ "						Ea qui culpa laboris duis id aliqua\r\n"
				+ "						<select name=\"select1\" value=\"\">\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "						</select>\r\n"
				+ "					</p>"
				+ "					<p>"
				+ "						Ea qui culpa laboris duis id aliqua\r\n"
				+ "						<select name=\"select1\" value=\"\">\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "							<option value=\"test\">Test</option>\r\n"
				+ "						</select>\r\n"
				+ "					</p>"
				+ "					<button type=\"button\" name=\"rule\">Règles</button>\r\n"
				+ "					<button type=\"button\" name=\"confirm\">Valider</button>\r\n"
				+ "					<button type=\"button\" name=\"exit\">Quitter</button>\r\n"
				+ "				</div>"
				+ "			</main>"
				+ "		</body>\r\n"
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
