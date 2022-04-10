package com.example.demo.service;

import com.example.demo.view.model.ReceptView;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("mock")
public class MockReceptService implements ReceptServiceInterface {

    @Override
    public void save(ReceptView receptView) {

    }

    @Override
    public ReceptView findByAzonosito(long azonosito) {
        return null;
    }
}
