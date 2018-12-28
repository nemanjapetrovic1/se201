/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se201.projekat;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nemanja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new Main();

    }

    public Main() {

        //kriptovalute
        Kriptovaluta bitkoin = new Kriptovaluta("Bitkoin", 3523, "Prva kriptovaluta");
        Kriptovaluta eth = new Kriptovaluta("Itirijum", 100, "Decentralizovana platforma za razne aplikacije.");

        //racuni
        //za potrebe demonstracije ce biti koriscenje simbolicne adrese - adresa1btc, adresa1usdt etc., a ne prave adrese zbog lakseg shvatanja
        Racun korisnik1btc = new Racun(bitkoin, "adresa1btc", 3);
        Racun korisnik1usdt = new Racun(eth, "adresa1usdt", 5000);

        Racun korisnik2btc = new Racun(bitkoin, "adresa2btc", 2);
        Racun korisnik2usdt = new Racun(eth, "adresa2usdt", 1000);

        //liste sa adresama 
        List<Racun> listakorisnik1 = new ArrayList<>();
        listakorisnik1.add(korisnik1btc);
        listakorisnik1.add(korisnik1usdt);

        List<Racun> listakorisnik2 = new ArrayList<>();
        listakorisnik2.add(korisnik2btc);
        listakorisnik2.add(korisnik2usdt);

        //Korisnici
        Korisnik korisnik1 = new Korisnik("Nemanja", "Petrovic", listakorisnik1);
        Korisnik korisnik2 = new Korisnik("Marijna", "Mirkovic", listakorisnik2);

        System.out.println("PRE TREJDA");
        System.out.println(korisnik1.toString());
        System.out.println(korisnik2.toString());

        //primer trgovine - korisnik 1 kupuje 1 btc od korisnika 2
        tradeBTC_USDT(korisnik1, korisnik2, 1, bitkoin);

        System.out.println("POSLE TREJDA");
        System.out.println(korisnik1.toString());
        System.out.println(korisnik2.toString());

    }

    //korisnik 1 - kupuje
    //korisnik 2 - prodaje
    public void tradeBTC_USDT(Korisnik korisnik1, Korisnik korisnik2, int kolicina, Kriptovaluta kriptovalutaK) {

        double fee = (kriptovalutaK.getCena()/100000)*5;
        double ukupnaCena = kriptovalutaK.getCena() * kolicina + fee;
  
        boolean testiranjeStanja = dovoljnoNovca(korisnik1.getRacun().get(1).getStanje(), ukupnaCena);

        //0 - bitkoin, 1-usdt
        if (testiranjeStanja) {

            korisnik1.getRacun().get(0).setStanje(korisnik1.getRacun().get(0).getStanje() + kolicina);
            korisnik1.getRacun().get(1).setStanje(korisnik1.getRacun().get(1).getStanje() - ukupnaCena);

            korisnik2.getRacun().get(0).setStanje(korisnik2.getRacun().get(0).getStanje() - kolicina);
            korisnik2.getRacun().get(1).setStanje(korisnik2.getRacun().get(1).getStanje() + ukupnaCena);

        } else {
            System.out.println("Nemate dovoljno novca na stanju.");
        }
    }

    public boolean dovoljnoNovca(double stanje, double ukupno) {
        return stanje > ukupno;
    }
    
    public void composite() {
    
        Kriptovaluta kriptovalutaPlatforma = new Kriptovaluta("Itirijum", 100, "Decentralizovana platforma za razne aplikacije.");

        Kriptovaluta token1 = new Kriptovaluta("Token1", 0.23, "Aplikacija za kladjenje.");
        Kriptovaluta token2 = new Kriptovaluta("Token2", 0.042, "Aplikacija za pracenje sportskih dogadjaja.");
        Kriptovaluta token3 = new Kriptovaluta("Token3", 0.104, "Aplikacija za nekretnine.");

        kriptovalutaPlatforma.add(token1);
        kriptovalutaPlatforma.add(token2);
        kriptovalutaPlatforma.add(token3);
        
        System.out.println(kriptovalutaPlatforma.toString());
        
    }
}
