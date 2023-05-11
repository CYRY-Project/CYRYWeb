package view;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccountUser
 */
@WebServlet("/AccountUser")
public class AccountUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AccountUser() {
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
				+ "    <html>"
				+ "        <head>"
				+ "            <meta charset=\"utf-8\">"
				+ "	           <link rel=\"stylesheet\" href=\"style/style.css\" />\r\n"
				+ "        </head>"
				+ "        <body>"
				+ "            <header>"
				+ "            <button type=\"button\" name=\"deleteAccount\">Supprimer le compte</button>"
				+ "            <button type=\"button\" name=\"confirmDelete\">Oui?</button><!-- A masquer avec java-->"
				+ "            <button type=\"button\" name=\"upadateAccount\">Modifier le compte</button>"
				+ "            <form method=\"post\" name=\"updateName\" action=\"\"><!-- A masquer avec java-->"
				+ "                <p>Nouvel Identifiant</p>"
				+ "                <input type=\"text\" name=\"newId\">"
				+ "                <button type=\"submit\" name=\"confirmNewID\">Valider</button>"
				+ "            </form>"
				+ "			   <button type=\"button\" name=\"logOut\">Déconnexion</button>"
				+ "            </header>"
				+ "            <main>"
				+ "                <img src=\"image/avatar/1.png\" alt=\"avatar\">"
				+ "                Identifiant"
				+ "                niveau : 999"
				+ "                score : 10000000"
				+ "            </main>"
				+ "            <footer>"
				+ "                <div name=\"exerciseType\">"
				+ "                    <p>0/0 QCM</p>"
				+ "                    <p>0/0 Situation</p>"
				+ "                    <p>0/0 Texte à trous</p>"
				+ "                    <p>0/0 Traduction</p>"
				+ "                    <p>0/0 Construction de phrase</p>"
				+ "                </div>"
				+ "                <div name=\"exerciseDifficulty\">"
				+ "                    <p>0/0 Débutant</p>"
				+ "                    <p>0/0 Intermédiaire</p>"
				+ "                    <p>0/0 Avancé</p>"
				+ "                </div>"
				+ "            </footer>"
				+ "        </body>"
				+ "    </html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
