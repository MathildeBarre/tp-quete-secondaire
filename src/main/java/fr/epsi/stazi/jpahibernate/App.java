package fr.epsi.stazi.jpahibernate;

import fr.epsi.stazi.jpahibernate.dao.helper.DatabaseHelper;

public class App {

	public static void main(String[] args) {
		// TODO: Appeler le DAO pour r�cup�rer la liste de tous les Pokemon pr�sents en base de donn�es
		
		// TODO: Ins�rer les 8 Pokemon suivants du pok�dex (cf. https://www.pokepedia.fr/Liste_des_Pok%C3%A9mon_dans_l%27ordre_du_Pok%C3%A9dex_de_Kanto)
		
		// TODO: R�cup�rer le Pokemon d'id 9
		
		// TODO: R�cup�rer le Pokemon de num�ro 12
		
		DatabaseHelper.closeEntityManagerFactory();
	}

}
