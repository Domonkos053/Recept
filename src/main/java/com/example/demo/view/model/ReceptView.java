package com.example.demo.view.model;

import java.util.ArrayList;
import java.util.List;

public class ReceptView {
    private long azonosito;
    private String nev;
    private String leiras;
    private List<HozzavaloView> hozzavaloViews;

    public long getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(long azonosito) {
        this.azonosito = azonosito;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public ReceptView(long azonosito, String nev) {
        this.azonosito = azonosito;
        this.nev = nev;
    }

    public ReceptView() {
        this.hozzavaloViews = new ArrayList<>();
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public List<HozzavaloView> getHozzavaloViews() {
        return hozzavaloViews;
    }

    public void setHozzavaloViews(List<HozzavaloView> hozzavaloViews) {
        this.hozzavaloViews = hozzavaloViews;
    }
}
