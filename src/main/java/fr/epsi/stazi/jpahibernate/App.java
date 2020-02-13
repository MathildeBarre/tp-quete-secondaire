package fr.epsi.stazi.jpahibernate;


import fr.epsi.stazi.jpahibernate.dao.helper.DatabaseHelper;


public class App {

    public static void main(String[] args) {
        DatabaseHelper.createEntityManager();
    }

}
