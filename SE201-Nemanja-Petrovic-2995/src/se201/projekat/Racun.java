/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se201.projekat;

/**
 *
 * @author Nemanja
 */
public class Racun {
    private Kriptovaluta kriptovaluta;
    private String adresa;
    private double stanje;

    public Racun(Kriptovaluta kriptovaluta, String adresa, double stanje) {
        this.kriptovaluta = kriptovaluta;
        this.adresa = adresa;
        this.stanje = stanje;
    }

    public Kriptovaluta getKriptovaluta() {
        return kriptovaluta;
    }

    public void setKriptovaluta(Kriptovaluta kriptovaluta) {
        this.kriptovaluta = kriptovaluta;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getStanje() {
        return stanje;
    }

    public void setStanje(double stanje) {
        this.stanje = stanje;
    }

    @Override
    public String toString() {
        return "Racun{" + "kriptovaluta=" + kriptovaluta + ", adresa=" + adresa + ", stanje=" + stanje + '}';
    }
    
    
}
