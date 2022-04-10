package com.example.demo.service;

import com.example.demo.view.model.ReceptView;

public interface ReceptServiceInterface  {
    public void save(ReceptView receptView);

    public ReceptView findByAzonosito (long azonosito);
}
