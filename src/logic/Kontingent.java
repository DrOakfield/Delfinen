/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Christian
 */
public class Kontingent {

    private final Member mem;
    private final AllMembers aMem;
    // Resultat for kontigentUdregner
    private double resultat;
    private int kontingent;

    public Kontingent(Member a, AllMembers b) {
        this.mem = a;
        this.aMem = b;
    }

    // aktivitetsform 0 = pasiv , 1 = aktiv
    public double kontingentUdregner(int age, String aktiv) {
        final double pasiv = 500;
        final double ungdomssvømmere = 1000;
        final double seniorsvømmmere = 1600;
        final double senior60;
        // snior rebat opgives i %
        final double seniorRebat = 25;

        if (age < 18 && aktiv.equals("ja")) {
            resultat = ungdomssvømmere;
        }
        if (age >= 18 && age < 60 && aktiv.equals("ja")) {
            resultat = seniorsvømmmere;
        }
        if (age >= 60 && aktiv.equals("ja")) {
            int i = (int) (seniorsvømmmere * seniorRebat);
            senior60 = i - seniorsvømmmere;
            resultat = senior60;
        } else {
            resultat = pasiv;
        }
        return resultat;
    } 

    public double getResultat() {
        return resultat;
    }
    
    public double Kontingent(){
        kontingent = kontingentUdregner(resultat, aktiv);
        return kontingent;
    }
}
