package com.example.demo.db.model;

public class Hozzavalo {
    private long azonosito;
    private long alapanyagAzonosito;
    private long mennyiseg;
    private long receptAzonosito;

    public long getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(long azonosito) {
        this.azonosito = azonosito;
    }

    public long getAlapanyagAzonosito() {
        return alapanyagAzonosito;
    }

    public void setAlapanyagAzonosito(long alapanyagAzonosito) {
        this.alapanyagAzonosito = alapanyagAzonosito;
    }

    public long getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(long mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public Hozzavalo(long azonosito, long alapanyagAzonosito, long mennyiseg) {
        this.azonosito = azonosito;
        this.alapanyagAzonosito = alapanyagAzonosito;
        this.mennyiseg = mennyiseg;
    }

    public long getReceptAzonosito() {
        return receptAzonosito;
    }

    public void setReceptAzonosito(long receptAzonosito) {
        this.receptAzonosito = receptAzonosito;
    }

    public Hozzavalo() {

    }
}
