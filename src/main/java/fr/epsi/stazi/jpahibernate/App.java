package fr.epsi.stazi.jpahibernate;

import fr.epsi.stazi.jpahibernate.dao.helper.DatabaseHelper;

public class App {

	public static void main(String[] args) {
		// TODO: Appeler le DAO pour récupérer la liste de tous les Pokemon présents en base de données
		
		// TODO: Insérer les 8 Pokemon suivants du pokédex (cf. https://www.pokepedia.fr/Liste_des_Pok%C3%A9mon_dans_l%27ordre_du_Pok%C3%A9dex_de_Kanto)
		
		// TODO: Récupérer le Pokemon d'id 9
		
		// TODO: Récupérer le Pokemon de numéro 12
		
		DatabaseHelper.closeEntityManagerFactory();
	}

}
