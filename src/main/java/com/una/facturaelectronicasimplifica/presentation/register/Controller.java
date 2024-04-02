package com.una.facturaelectronicasimplifica.presentation.register;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller("register")
public class Controller {
    @GetMapping("/presentation/register/show")
    public String show() {
        return "/presentation/register/View";
    }
}
