package com.example.app.SpringBootWebClients.controller;

import com.example.app.SpringBootWebClients.service.PhoneService;
import com.example.app.SpringBootWebClients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class HomeController {

    @Autowired
    ClientService clientService;
    @Autowired
    PhoneService phoneService;

    @GetMapping("/")
    public String getHome(Model model) throws URISyntaxException, IOException {
        model.addAttribute("clients", clientService.getClients());
        model.addAttribute("phones", phoneService.getPhones());
        return "home";
    }
}
