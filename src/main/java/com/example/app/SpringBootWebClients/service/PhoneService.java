package com.example.app.SpringBootWebClients.service;

import com.example.app.SpringBootWebClients.entity.Phone;
import com.example.app.SpringBootWebClients.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class PhoneService {

    @Autowired
    PhoneRepository repository;

    public List<Phone> getPhones() throws URISyntaxException, IOException {
        return repository.getPhones();
    }
}
