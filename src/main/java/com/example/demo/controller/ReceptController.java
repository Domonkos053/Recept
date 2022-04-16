package com.example.demo.controller;

import com.example.demo.repository.ReceptRepository;
import com.example.demo.service.ReceptService;
import com.example.demo.service.ReceptServiceInterface;
import com.example.demo.view.ReceptInnitView;
import com.example.demo.view.model.ReceptView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.awt.*;

@Controller
public class ReceptController extends JFrame {
    private ReceptInnitView receptInnitView;
    JMenuBar menuBar;

//    @Autowired
//    private ReceptRepository receptRepository;

    @Autowired
   // @Qualifier("rendes")
    public ReceptController( @Qualifier("rendes") ReceptServiceInterface receptServiceInterface) throws HeadlessException {
        this.receptInnitView = new ReceptInnitView(receptServiceInterface);

        this.setContentPane(receptInnitView.$$$getRootComponent$$$());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenu menu;
        JMenuItem menuItem;
        menuItem = new JMenuItem("példa");
        menu = new JMenu("menü");
        menuBar = new JMenuBar();
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
        menu.add(menuItem);

        this.pack();
        this.setSize(1000,500);
    }
}
