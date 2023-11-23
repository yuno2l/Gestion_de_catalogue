package DAO;

import java.sql.*;
import java.util.*;

import com.isitcom.formationSpringboot.demo1.services.IGestionProduit;

import entities.Produit;

public class GestionProduit implements IGestionProduit {
	// private List<Produit> ListProduit = new ArrayList<Produit>();

	@Override
	public void addProduit(Produit p) {
		Connection cx = SingletonConnection.getConnection();
		try {
			PreparedStatement st = cx.prepareStatement("insert into produit(nom,prix,qte) values(?,?,?)");
			st.setString(1, p.getNom());
			st.setDouble(2, p.getPrix());
			st.setInt(3, p.getQte());

			st.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public List<Produit> getAllProducts() {
		List<Produit> liste = new ArrayList<>();
		Connection cx = SingletonConnection.getConnection();
		try {
			PreparedStatement st = cx.prepareStatement("select * from produit");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Produit f = new Produit(rs.getInt("idProduit"), rs.getString("nom"), rs.getDouble("Prix"),
						rs.getInt("qte"));
				liste.add(f);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return liste;

	}

	@Override
	public void deleteProduct(int id) {
		Connection cx = SingletonConnection.getConnection();
		try {
			PreparedStatement st = cx.prepareStatement("delete from produit where idProduit = ?");
			st.setInt(1, id);

			st.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public Produit getProductById(int id) {
		Connection cx = SingletonConnection.getConnection();
		Produit f = new Produit();
		try {
			PreparedStatement st = cx.prepareStatement("select * from produit where idProduit=?");
			st.setInt(1, id);

			ResultSet rs = st.executeQuery();
			f.setId(rs.getInt("idProduit"));
			f.setNom(rs.getString("nom"));
			f.setPrix(rs.getDouble("Prix"));
			f.setQte(rs.getInt("qte"));

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return f;
	}

	@Override
	public List<Produit> getProductByMc(String mc) {
		List<Produit> liste = new ArrayList<>();
		Connection cx = SingletonConnection.getConnection();
		try {
			PreparedStatement st = cx.prepareStatement("select * from produit where produit.nom like concat ( '%' , ? , '%') ");
			st.setString(1, mc);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Produit f = new Produit(rs.getInt("idProduit"), rs.getString("nom"), rs.getDouble("Prix"),
						rs.getInt("qte"));
				liste.add(f);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return liste;
	}

	@Override
	public void updateProduct(Produit p) {
		Connection cx = SingletonConnection.getConnection();
		try {
			PreparedStatement st = cx.prepareStatement("update produit set nom = ?, prix = ?, qte = ? where idProduit = ?");
			st.setString(1, p.getNom());
			st.setDouble(2, p.getPrix());
			st.setInt(3, p.getQte());
			st.setInt(4, p.getId());

			st.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
