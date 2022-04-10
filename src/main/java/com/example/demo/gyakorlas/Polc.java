package com.example.demo.gyakorlas;

import java.util.ArrayList;
import java.util.List;

public class Polc {
    private long meret;
    private String nev;
    List<Konyv> konyvek;

    public long getMeret() {
        return meret;
    }

    public void setMeret(long meret) {
        this.meret = meret;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<Konyv> getKonyvek() {
        return konyvek;
    }

    public void setKonyvek(List<Konyv> konyvek) {
        this.konyvek = konyvek;
    }

    public Polc() {
        this.konyvek = new ArrayList<>();
    }
}
