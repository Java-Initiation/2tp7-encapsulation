package banque;

import banque.entites.Compte;

public class TestBanque {

    public static void main(String[] args) {

        Compte compte = new Compte(23, 4545.00);
        System.out.println(compte);

    }

}
