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
public class Kriptovaluta implements KriptovalutaInterfejs {

    private String naziv;
    private double cena;
    private String opis;
    private List<KriptovalutaInterfejs> drugeKriptovalute = new ArrayList<KriptovalutaInterfejs>();

    
    
    public Kriptovaluta() {
    }

    public Kriptovaluta(String naziv, double cena, String opis) {
        this.naziv = naziv;
        this.cena = cena;
        this.opis = opis;
    }
    
    @Override
    public void add(KriptovalutaInterfejs k) {
        drugeKriptovalute.add(k);
    }

    @Override
    public void remove(KriptovalutaInterfejs k) {
        drugeKriptovalute.remove(k);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public List<KriptovalutaInterfejs> getDrugeKriptovalute() {
        return drugeKriptovalute;
    }

    public void setDrugeKriptovalute(List<KriptovalutaInterfejs> drugeKriptovalute) {
        this.drugeKriptovalute = drugeKriptovalute;
    }

    @Override
    public String toString() {
        return "Kriptovaluta{" + "naziv=" + naziv + ", cena=" + cena + ", opis=" + opis + ", drugeKriptovalute=" + drugeKriptovalute + '}';
    }

    

    
    
}
