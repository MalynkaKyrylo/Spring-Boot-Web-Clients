package com.example.app.SpringBootWebTours.service;

import com.example.app.SpringBootWebTours.entity.Resort;
import com.example.app.SpringBootWebTours.repository.ResortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class ResortService {

    @Autowired
    ResortRepository repository;

    public List<Resort> getResorts() throws URISyntaxException, IOException {
        return repository.getResorts();
    }
}
