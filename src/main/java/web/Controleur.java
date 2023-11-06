package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.*;

import entities.Produit;/**
 * Servlet implementation class Controleur
 */
@WebServlet("/Controleur")
public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()	
     */
    public Controleur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    IGestionProduit gestion;
	public void init(ServletConfig config) throws ServletException {
		gestion = new GestionCatalogueImplJPA();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		
			String action = request.getParameter("action");
			
			if(action==null) {
		
		List<Produit> liste  = gestion.getAllProducts(); 
		request.setAttribute("products", liste);
		request.getRequestDispatcher("index2.jsp").forward(request, response);
		
			}
			
			
			else if (action.equalsIgnoreCase("editPage"))
			{
				int id = Integer.parseInt(request.getParameter("id"));
				String nom = request.getParameter("nom");
				Double prix = Double.parseDouble(request.getParameter("prix"));
				int qte = Integer.parseInt(request.getParameter("qte"));
				request.setAttribute("nom", nom);
				request.setAttribute("prix", prix);
				request.setAttribute("qte", qte);
				request.setAttribute("prodid", id);
				request.getRequestDispatcher("edit.jsp").forward(request, response);
			}
			
			else if(action.equalsIgnoreCase("addPage"))
			{
				request.getRequestDispatcher("add.jsp").forward(request, response);
			}
			
			
			
			
			else if(action.equalsIgnoreCase("rechercher"))
			{
				String mc = request.getParameter("mc");
				request.setAttribute("products", gestion.getProductByMc(mc));
				request.getRequestDispatcher("index2.jsp").forward(request, response);
			}
			
			
			else if(action.equalsIgnoreCase("delete"))
			{
				
				int id = Integer.parseInt( request.getParameter("id"));
				gestion.deleteProduct(id);
				request.setAttribute("products", gestion.getAllProducts());
				request.getRequestDispatcher("index2.jsp").forward(request, response);

			}
			
			
			else if(action.equalsIgnoreCase("add"))
			{
				Produit pd = new Produit();
				pd.setNom(request.getParameter("nom"));
				pd.setPrix(Double.parseDouble(request.getParameter("prix")));
				pd.setQte(Integer.parseInt(request.getParameter("qte")));
				gestion.addProduit(pd);
				request.setAttribute("products", gestion.getAllProducts());
				request.getRequestDispatcher("index2.jsp").forward(request, response);
				
				
				
				
			}
			
			else if(action.equalsIgnoreCase("edit"))
			{
				
				int id = Integer.parseInt(request.getParameter("id"));
				String nom = request.getParameter("nom");
				int qte = Integer.parseInt(request.getParameter("qte"));
				Double prix = Double.parseDouble(request.getParameter("prix"));
				Produit pd = new Produit(id,nom,prix,qte);
				gestion.updateProduct(pd);
				request.setAttribute("products", gestion.getAllProducts());
				request.getRequestDispatcher("index2.jsp").forward(request, response);
			}
			
			
			

			

			}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
