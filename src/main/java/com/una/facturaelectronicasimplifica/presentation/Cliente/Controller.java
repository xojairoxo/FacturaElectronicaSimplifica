package com.una.facturaelectronicasimplifica.presentation.Cliente;

import com.una.facturaelectronicasimplifica.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller("clientes")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/presentation/cliente/show")

    public String show(Model model){

        model.addAttribute("clientes",service.clienteFindALL());
        return "/presentation/clientes/View";
    }

}
