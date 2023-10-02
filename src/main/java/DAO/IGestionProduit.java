	package DAO;
	
	import java.util.List;
	import entities.Produit;
	
	public interface IGestionProduit {
		public void addProduit(Produit p);
		public List<Produit> getAllProducts();
		public void deleteProduct(int id);
		public Produit getProductById(int id);
		public List<Produit> getProductByMc(String mc);
		public void updateProduct(Produit p);
		
		
	
	}
