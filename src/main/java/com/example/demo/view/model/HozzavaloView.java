package com.example.demo.view.model;

public class HozzavaloView {
    private long azonosito;
    private AlapanyagView alapanyagView;
    private long mennyiseg;
    private ReceptView receptView;

    public long getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(long azonosito) {
        this.azonosito = azonosito;
    }

    public AlapanyagView getAlapanyagView() {
        return alapanyagView;
    }

    public void setAlapanyagView(AlapanyagView alapanyagView) {
        this.alapanyagView = alapanyagView;
    }

    public long getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(long mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public ReceptView getReceptView() {
        return receptView;
    }

    public void setReceptView(ReceptView receptView) {
        this.receptView = receptView;
    }
}
