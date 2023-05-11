package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SwapPage
 */
@WebServlet("/SwapPage")
public class SwapPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SwapPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String value = request.getParameter("buttonValue");
		swapPage(value, response);
	}
	
	public static void swapPage(String value, HttpServletResponse response)
	{
		switch(value)
		{
			case "LogIn":
			try
			{
				response.sendRedirect("Connection");
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
			case "SignIn":
			try
			{
				response.sendRedirect("Inscription");
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
			case "ForgetPassword":
			try
			{
				response.sendRedirect("ForgetPassword");
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
			case "MainPage":
			try
			{
				response.sendRedirect("MainPage");
			}catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
			case "Home":
			try
			{
				response.sendRedirect("Home");
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
			case "Menu":
			try
			{
				response.sendRedirect("Menu");
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
			case "Account":
			try
			{
				response.sendRedirect("AccountUser");
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
			case "LevelCompleted":
			try
			{
				response.sendRedirect("LevelCompleted");
			}
			catch(IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
	}
}