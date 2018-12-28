/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se201.projekat;

import java.util.List;

/**
 *
 * @author Nemanja
 */
public class Korisnik {
    private String ime;
    private String prezime;
    private List<Racun> racun;

    public Korisnik(String ime, String prezime, List<Racun> racun) {
        this.ime = ime;
        this.prezime = prezime;
        this.racun =  racun;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public List<Racun> getRacun() {
        return racun;
    }

    public void setRacun(List<Racun> racun) {
        this.racun = racun;
    }

    @Override
    public String toString() {
        return "Korisnik{" + "ime=" + ime + ", prezime=" + prezime + ", racun=" + racun + '}';
    }
    
       
            
}
