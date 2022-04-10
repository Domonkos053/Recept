package com.example.demo.service;

import com.example.demo.gyakorlas.Konyv;
import com.example.demo.gyakorlas.Polc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KonyvtarService {

    public void konyvlista(Polc polc) {
        for (Konyv konyv : polc.getKonyvek()) {
            System.out.print(konyv.getCim());
            System.out.print(" - ");
            System.out.println(konyv.getOldalszam());
        }
    }

    public void leghosszabbKonyv(Polc polc) {
        long max = 0;
        String cim = "";
        for (Konyv konyv : polc.getKonyvek()) {
            if (max < konyv.getOldalszam()) {
                max = konyv.getOldalszam();
                cim = konyv.getCim();
            }
        }
        System.out.println("A maximum: " + max);
        System.out.println("A leghosszabb könyv címe:  " + cim);
    }

    public void legrovidebbKonyv(Polc polc) {
        long min = 100000000;
        String cim = "";
        for (Konyv konyv : polc.getKonyvek()) {
            if (min > konyv.getOldalszam()) {
                min = konyv.getOldalszam();
                cim = konyv.getCim();
            }
        }
        System.out.println("A minimum: " + min);
        System.out.println("A legrövidebb könyv címe:  " + cim);
    }

    public long sum(Polc polc) {
        long sum = 0;
        for (Konyv konyv : polc.getKonyvek()) {
            sum = sum + konyv.getOldalszam();
        }
        System.out.println("Ennyi oldalt olvashatsz összesen:" + sum);
        return sum;
    }

    public long atlag(Polc polc){
        /*long atlag = 0;
        for (Konyv konyv : polc.getKonyvek()){
            atlag = atlag + konyv.getOldalszam();
        }*/
       long atlag = sum(polc)/polc.getKonyvek().size();
        System.out.print("Átlagosan ennyi oldal van egy könyvben:" + atlag);
        return atlag;
    }

    public void leghoszabbCim(Polc polc){
        long max = 0;
        String cim = "";
        for (Konyv konyv : polc.getKonyvek()) {
            if (max < konyv.getCim().length()){
                max = konyv.getCim().length();
                cim = konyv.getCim();
            }
        }
        System.out.println("Ennyi karakterből áll:" + max);
        System.out.println("A leghoszabb című könyved:" + cim);
    }

    public  void legrovidebbCim(Polc polc){
        long min = 100000000;
        String cim = "";
        for (Konyv konyv : polc.getKonyvek()) {
            if (min > konyv.getCim().length()){
                min = konyv.getCim().length();
                cim = konyv.getCim();
            }
        }
        System.out.println("Ennyi karakterből áll:" + min);
        System.out.println("A legrövidebb című könyved:" + cim);
    }


   /* public void maxLong(List<Long> longList) {
        long max = 0;
        for(Long elem : longList) {
            if (max < elem) {
                max = elem;
            }
        }
        System.out.println("A maximum: " + max);
    }*/
}



