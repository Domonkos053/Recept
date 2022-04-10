package com.example.demo;

import com.example.demo.controller.ReceptController;
import com.example.demo.view.model.Arucikk;
import com.example.demo.view.model.Fenymasolopapir;
import com.example.demo.view.model.Szarazteszta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class SwingDemoCommandLineRunner implements CommandLineRunner {

    private final ReceptController controller;

    @Autowired
    public SwingDemoCommandLineRunner(ReceptController controller) {
        this.controller = controller;
    }

    @Override
    public void run(String... args) throws Exception {

        EventQueue.invokeLater(() -> controller.setVisible(true));

        arkiiro(new Szarazteszta(500,"g","cénametélt"));
        arkiiro(new Fenymasolopapir(500,"A4"));
    }
    private void arkiiro(Arucikk arucikk){
        System.out.println(arucikk.getAr());
    }

}
