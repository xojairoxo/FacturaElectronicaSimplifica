package com.una.facturaelectronicasimplifica.presentation.Proveedor;

import com.una.facturaelectronicasimplifica.logic.ProveedorEntity;
import com.una.facturaelectronicasimplifica.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller("proveedores")
public class ProveedorController {
    @Autowired
    ProveedorService service;

    @GetMapping("/presentation/proveedores/show")
    public String show(Model model) {
        model.addAttribute("proveedores", service.ProveedorFindAll());
        return "/presentation/proveedores/View";
    }
    @GetMapping("/presentation/proveedores/add")
    public String add(Model model) {
        model.addAttribute("proveedor", new ProveedorEntity());
        return "/presentation/proveedores/Add";
    }
}
