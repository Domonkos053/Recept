package com.example.demo.view.model;

public class Fenymasolopapir implements Arucikk {
    private  long lapszam;

    private String meret;

    public long getLapszam() {
        return lapszam;
    }

    public void setLapszam(long lapszam) {
        this.lapszam = lapszam;
    }

    public String getMeret() {
        return meret;
    }

    public void setMeret(String meret) {
        this.meret = meret;
    }

    public Fenymasolopapir(long lapszam, String meret) {
        this.lapszam = lapszam;
        this.meret = meret;
    }

    @Override
    public long getAr() {
        return 2*lapszam;
    }

    @Override
    public String gettAfaTipus() {
        return "27%";
    }
}
