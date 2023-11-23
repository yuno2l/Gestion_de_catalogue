package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isitcom.formationSpringboot.demo1.services.IGestionProduit;

import DAO.*;
import entities.Produit;
/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/index.php")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IGestionProduit gestion = new GestionProduit();
		List<Produit> liste  = gestion.getAllProducts(); 
		PrintWriter out = response.getWriter();
		out.println("<html><body><table border=1 >");
		out.println("<tr><th>Nom</th><th>Prix</th></tr>");
		for(Produit p:liste)
			out.println("<tr><td>"+p.getNom()+"</td><td>"+p.getPrix()+"</td></tr>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
