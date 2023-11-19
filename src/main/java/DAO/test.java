package DAO;
import java.util.ArrayList;
import java.util.List;

import entities.Produit;
import entities.Categorie;
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//List<Produit>liste=new ArrayList<>();
		
		GestionCategorieImpl gc = new GestionCategorieImpl();
		Categorie c = new Categorie("test");
		gc.addCategorie(c);
		

		//Produit p1 = new Produit();
		//p1.setId(2);
		//p1.setNom("mmmmmmmm");
		//p1.setPrix(45765);
		//p1.setQte(12329);
		
		//GestionProduit gp = new GestionProduit();
		//gp.addProduit(p1);
		//gp.updateProduct(p1);
		
		
		
		//gp.deleteProduct(1);
		//liste = gp.getProductByMc("1");
		
                //for ( Produit p : liste){
                	/*System.out.print("    id: ");
                    System.out.print(p.getId());
                    System.out.print("    nom: ");
                    System.out.print(p.getNom());
                    System.out.print("    Prix: ");
                    System.out.print(p.getPrix());
                   System.out.print("    qte: ");
                    System.out.print(p.getQte());
                    System.out.println();*/
		
		
                    
                    
                }
        
		
		
		
		
	}


