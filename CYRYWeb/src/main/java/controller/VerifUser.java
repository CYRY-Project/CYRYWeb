package controller;

import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class VerifUser
 */
@WebServlet("/VerifUser")
public class VerifUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public VerifUser() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		switch(request.getParameter("formCheck"))
		{
			case "LogIn" :
				verifConn(request.getParameter("name"), request.getParameter("password"), response, session);
				break;
			case "SignIn" :
				verifSub(request.getParameter("name"), request.getParameter("password"), request.getParameter("passwordVerif"), request.getParameter("birthDate"), response, session);
				break;
			case "ForgetPassword" :
				forgetPassword(request.getParameter("name"), request.getParameter("password"), request.getParameter("passwordVerif"), request.getParameter("birthDate"), response);
				break;
			case "LevelCalculation" :
				//levelCalculation(user);
				break;
			case "VerifLevelDone" :
				//verifLevelDone(user, difficulty, response);
		}
	}
	
	public static void verifConn(String name, String password, HttpServletResponse response, HttpSession session)
	{
		/****** Requete utilisé lors du select pour le test du pseudo déja utilisé *****/

		String queryUser = "SELECT userName, userPassword "
				+ "FROM user "
				+ "WHERE userName = '" + name + "';";

		/***** Instanciation de l'objet JDBC******/

		JDBC conn = new JDBC();
		ResultSet verifBdd = conn.select(queryUser);

		/**** Partie Test *******/

		try
		{
			if(verifBdd.next())
			{
				if(password.equals(verifBdd.getString("userPassword"))) // on test si le mdp est présent en bdd
				{
					String query = "SELECT userLevel,userPoints,userName,idAvatar "
							+ "FROM user "
							+ "WHERE userName ='" + name + "';";

					String queryExercise = "SELECT exercisedone.idExercise "
							+ "FROM exercisedone "
							+ "JOIN user "
							+ "USING (idUser) "
							+ "WHERE user.userName = '" + name + "';";

					ResultSet recupData = conn.select(query);

					if(recupData.next())
					{
						User user = new User(name,recupData.getInt("idAvatar"));
						user.setUserLevel(recupData.getInt("userLevel"));
						user.setUserPoints(recupData.getInt("userPoints"));
						
						session.setAttribute("user", user);
						
						ResultSet recupExerciseDone = conn.select(queryExercise);

						while(recupExerciseDone.next())
						{
							user.setExerciseDone(recupExerciseDone.getInt("idExercise"));
						}
						conn.closeConnection();
						System.out.println("Vous êtes connectés");
						// JOptionPane.showMessageDialog(null,"Vous êtes connectés");
						SwapPage.swapPage("Home", response);
					}
				}
				else
				{
					System.out.println("Utlisateur ou mot de passe incorrect");
					// JOptionPane.showMessageDialog(null,"Utlisateur ou mot de passe incorrect");
					// !!! ajouter une méthode pour effacer les données des input !!!
				}
			}
			else 
			{
				System.out.println("Utlisateur ou mot de passe incorrect");
				// JOptionPane.showMessageDialog(null,"Utlisateur ou mot de passe incorrect");
				// !!! ajouter une méthode pour effacer les données des input !!!
			}
		}
		catch(HeadlessException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		conn.closeConnection();
	}
	
	public static void verifSub(String name, String password, String passConf, String date, HttpServletResponse response, HttpSession session)
	{

		/****** Requete utilisé lors du select pour le test du pseudo déja utilisé *****/

		String query = "SELECT userName "
				+ "FROM user "
				+ "WHERE userName = '" + name + "';";

		/***** Instanciation de l'objet JDBC******/

		JDBC conn = new JDBC();
		ResultSet verif = conn.select(query);
		System.out.println("utilisateur disponible");

		/***** Partie Test *********/

		if(name.isBlank() || password.isBlank() || date.isBlank())
		{
			System.out.println("Les champs sont vides");
			// JOptionPane.showMessageDialog(App.getApp(),"Le(s) champ(s) sont vides");
			return;
		}
		try
		{
			if(!verif.next())
			{
				if(password.equals(passConf))
				{
					System.out.println("if mots de passe identiques");
					int avatar = new Random().nextInt((10 - 1) + 1) + 1;
					System.out.println("avatar choisi : " + avatar);
					User user = new User(name, avatar);
					System.out.println("user créé");
					user.setUserLevel(1);
					System.out.println("level 1");
					user.setUserPoints(0);
					System.out.println("0 points");
					conn.insertUser(name, password, date, avatar);
					// BLOQUED
					System.out.println("utilisateur inséré");
					conn.closeConnection();
					System.out.println("connexion terminée");
					SwapPage.swapPage("MainPage", response);
				}
				else
				{
					System.out.println("Les mots de passe ne sont pas identiques");
					// JOptionPane.showMessageDialog(App.getApp(),"Les mots de passe ne sont pas identiques");
				}
			}
			else
			{
				System.out.println("Identifiant déja utilisé");
				// JOptionPane.showMessageDialog(App.getApp(),"Identifiant déja utilisé") ;
			}
		}
		catch(HeadlessException e){
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		conn.closeConnection();
	}
	
	public static void forgetPassword(String name, String password, String passwordVerif, String birthDate, HttpServletResponse response)
	{

		// On vérifie avant si les champs sont vides 

		if(name.isBlank() || password.isBlank() || passwordVerif.isBlank() || birthDate.isBlank())
		{
			System.out.println("Les champs sont vides");
			// JOptionPane.showMessageDialog(App.getApp(),"Le(s) champ(s) sont vides");
			return;
		}

		String query = "SELECT userName,userPassword,userBirthDate "
				+ " FROM user "
				+ " WHERE userName = '" + name + "';";

		JDBC conn = new JDBC();
		ResultSet verif = conn.select(query);

		try
		{
			if(verif.next())
			{
				if(password.equals(passwordVerif))
				{
					if(birthDate.equals(verif.getString("userBirthDate")))
					{
						String insert = "UPDATE user "
								+ "SET userPassword = '" + password +"' "
								+ "WHERE userName = '" + name +"';";

						conn.updateDB(insert);
						System.out.println("Votre mot de passe a été mis à jour");
						// JOptionPane.showMessageDialog(App.getApp(),"Votre mot de passe a été mis à jour");
						conn.closeConnection();
						SwapPage.swapPage("LogIn", response);
					}
					else
					{
						System.out.println("La date de naissance saisie est érronée");
						// JOptionPane.showMessageDialog(App.getApp(),"La date de naissance saisie est érronée");
					}
				}
				else
				{
					System.out.println("Les mots de passe ne sont pas identiques");
					// JOptionPane.showMessageDialog(App.getApp(),"Les mots de passe ne sont pas identiques");
				}
			}
			else
			{
				System.out.println("Votre identifiant n'est pas reconnu");
				// JOptionPane.showMessageDialog(App.getApp(),"Votre identifiant n'est pas reconnu");
			}
		}
		catch(HeadlessException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		conn.closeConnection();
	}
	
	public static void levelCalculation(User user)
	{
		if(user.getUserPoints() % 1000 == 0)
		{
			user.setUserLevel(user.getUserLevel() + 1);
		}
	}
	
	public static void verifLevelDone(User user, int difficulty, HttpServletResponse response)
	{
		int exerciseDoneNumber = 0 ;
		int exerciseNumber = 0;
		String query = "SELECT exercise.idExercise "
				+ "FROM exercise "
				+ "JOIN difficulty "
				+ "USING (idDifficulty) "
				+ "WHERE idDifficulty = " + difficulty + ";";

		JDBC conn = new JDBC();
		ResultSet recupData = conn.select(query);

		try
		{
			while(recupData.next())
			{
				if(user.getExerciseDone().contains(recupData.getInt("idExercise")))
				{
					exerciseDoneNumber++;
				}
				exerciseNumber++;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		conn.closeConnection();

		if(exerciseDoneNumber == exerciseNumber)
		{
			SwapPage.swapPage("LevelCompleted", response);
		}
		else
		{
			//@SuppressWarnings("unused")
			//ExerciseSelect exercise = new ExerciseSelect(user, difficulty);
		}
	}
}
