package com.una.facturaelectronicasimplifica.presentation.proveedor;
import com.una.facturaelectronicasimplifica.logic.UsuarioEntity;
import com.una.facturaelectronicasimplifica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller("proveedores")
public class Controller {
    @Autowired
    private UsuarioService service;

    @GetMapping("/presentation/proveedores/show")
    public String show(Model model){
        model.addAttribute("proveedores", service.proveedorFindAll());
        return "/presentation/proveedores/View";
    }
    @GetMapping("/presentation/register/show")
    public String registerShow() {
        return "/presentation/register/View";
    }

    @PostMapping("/presentation/register/register")
    public String add(@ModelAttribute UsuarioEntity proveedor) {
        service.proveedorSave(proveedor);
        return "redirect:/presentation/login/show";
    }

    @GetMapping("/presentation/login/show")
    public String loginShow() {
        return "/presentation/login/View";
    }

    @PostMapping("/presentation/login/login")
    public String login(@RequestParam String idProveedor, @RequestParam String contrasena) {
        if(service.proveedorLogin(idProveedor, contrasena)) {
            return "/presentation/proveedorLogin/View";
        }else
            return "redirect: /presentation/login/View";
    }

}
