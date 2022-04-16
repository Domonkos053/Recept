package com.example.demo.service;

import com.example.demo.db.model.Hozzavalo;
import com.example.demo.db.model.Recept;
import com.example.demo.repository.AlapanyagRepository;
import com.example.demo.repository.HozzavalokRepository;
import com.example.demo.repository.ReceptRepository;
import com.example.demo.view.model.HozzavaloView;
import com.example.demo.view.model.ReceptView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Service
@Qualifier("rendes")
public class ReceptService implements ReceptServiceInterface {
    @Autowired
    private ReceptRepository receptRepository;

    @Autowired
    private HozzavalokRepository hozzavalokRepository;

    @Autowired
    private AlapanyagRepository alapanyagRepository;

    @Transactional
    public void save(ReceptView receptView){
        Recept recept = new Recept();
        recept.setNev(receptView.getNev());
        recept.setLeiras(receptView.getLeiras());
        try {
            byte[] bytes = Files.readAllBytes(receptView.getKep().toPath());
            recept.setKep(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        receptRepository.insert(recept );
      for (HozzavaloView hozzavaloView: receptView.getHozzavaloViews()){

          Hozzavalo hozzavalo = new Hozzavalo();
          hozzavalo.setMennyiseg(hozzavaloView.getMennyiseg());
          hozzavalo.setReceptAzonosito(recept.getAzonosito());
          hozzavalo.setAlapanyagAzonosito(hozzavaloView.getAlapanyagView().getAzonosito());
          hozzavalokRepository.insert(hozzavalo);
      }
    }

    public ReceptView findByAzonosito (long azonosito) {
        Recept recept = receptRepository.findById(azonosito);
        ReceptView receptView = new ReceptView();
        receptView.setNev(recept.getNev());
        receptView.setAzonosito(recept.getAzonosito());
        receptView.setLeiras(recept.getLeiras());

        receptRepository.findById(azonosito);
        for (Hozzavalo hozzavalo : hozzavalokRepository.findByReceptAzonosito(azonosito)) {
            HozzavaloView hozzavaloView = new HozzavaloView();
            hozzavaloView.setMennyiseg(hozzavalo.getMennyiseg());
            hozzavaloView.setAzonosito(hozzavalo.getAzonosito());
            /*hozzavaloView.setAlapanyagView(hozzavalo.getAlapanyagAzonosito());*/
            receptView.getHozzavaloViews().add(hozzavaloView);
        }
            return receptView;
    }
}
