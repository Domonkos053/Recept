package com.example.demo.view.model;

public class Szarazteszta  implements Arucikk{
    private long suly;
    private String mertekegyseg;
    private String fajta;

    public long getSuly() {
        return suly;
    }

    public void setSuly(long suly) {
        this.suly = suly;
    }

    public String getMertekegyseg() {
        return mertekegyseg;
    }

    public void setMertekegyseg(String mertekegyseg) {
        this.mertekegyseg = mertekegyseg;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public Szarazteszta(long suly, String mertekegyseg, String fajta) {
        this.suly = suly;
        this.mertekegyseg = mertekegyseg;
        this.fajta = fajta;
    }

    @Override
    public long getAr() {
        return 5*suly;
    }

    @Override
    public String gettAfaTipus() {
        return "0%";
    }
}
