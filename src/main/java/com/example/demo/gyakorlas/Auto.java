package com.example.demo.gyakorlas;

public class Auto {
    private String márka;
    private long loero;
    private  String szin;

    public String getMárka(){
        return márka;
    }

    public String getSzin(){
        return szin;
    }

    public long getLoero(){
        return loero;
    }

    public void setMárka(String márka) {
        this.márka = márka;
    }

    public void setLoero(long loero) {
        this.loero = loero;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public  String kiir(){
        return "színe: " + szin + " márkája: " + márka + " teljesítménye: " + loero;
    }
}
