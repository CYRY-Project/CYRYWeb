package view;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/Menu")
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Menu() {
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
				+ "    <head>\r\n"
				+ "        <meta charset=\"utf-8\">\r\n"
				+ "	       <link rel=\"stylesheet\" href=\"style/style.css\" />\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <h1>\r\n"
				+ "            Niveau de difficulté\r\n"
				+ "        </h1>\r\n"
				+ "        <button type=\"button\" name=\"easy\">Débutant</button>\r\n"
				+ "        <button type=\"button\" name=\"medium\">Intermédiaire</button>\r\n"
				+ "        <button type=\"button\" name=\"hard\">Avancé</button>\r\n"
				+ "        <button type=\"button\" name=\"List\">Liste Personnalisée</button>\r\n"
				+ "    </body>\r\n"
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
