package com.example.demo.db.model;

public class Recept {
    private long azonosito;
    private String nev;
    private String leiras;
    private byte[] kep;

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

    public Recept(long azonosito, String nev) {
        this.azonosito = azonosito;
        this.nev = nev;
    }

    public Recept() {

    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public byte[] getKep() {
        return kep;
    }

    public void setKep(byte[] kep) {
        this.kep = kep;
    }
}
