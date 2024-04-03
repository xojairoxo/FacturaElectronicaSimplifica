package com.una.facturaelectronicasimplifica.presentation.cliente;
import com.una.facturaelectronicasimplifica.logic.ClienteEntity;
import com.una.facturaelectronicasimplifica.service.ClienteService;
import com.una.facturaelectronicasimplifica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller("cliente")
public class Controller {
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private UsuarioService proveedorService;
    @GetMapping("/presentation/cliente/register")
    public String register() {
        return "/presentation/proveedorLogin/cliente/View";
    }

    @PostMapping("/presentation/cliente/add")
    public String add(@ModelAttribute ClienteEntity cliente){
        cliente.setUsuarioByUsuarioId(proveedorService.proveedorById(cliente.getUsuarioId()));
        clienteService.clienteSave(cliente);
        return "redirect:/presentation/clientes";
    }


    @GetMapping("/presentation/clientes")
    public String show(Model model) {
        model.addAttribute("clientes", clienteService.clienteFindAll());
        return "/presentation/proveedorLogin/cliente/listarCliente";
    }
}
