package com.una.facturaelectronicasimplifica.presentation.producto;
import com.una.facturaelectronicasimplifica.logic.ProductoEntity;
import com.una.facturaelectronicasimplifica.service.ProductoService;
import com.una.facturaelectronicasimplifica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller("producto")
public class Controller {
    @Autowired
    ProductoService productoService;
    @Autowired
    private UsuarioService proveedorService;
    @GetMapping("/presentation/producto/show")
    public String show(Model model) {
        model.addAttribute("productos", productoService.productoFindAll());
        return "/presentation/proveedorLogin/producto/listarProductos";
    }
    @GetMapping("/presentation/producto/register")
    public String register() {
        return "/presentation/proveedorLogin/producto/View";
    }
    @PostMapping("/presentation/producto/add")
    public String add(@ModelAttribute ProductoEntity producto){
        producto.setUsuarioByUsuarioId(proveedorService.proveedorById(producto.getUsuarioId()));
        productoService.productoSave(producto);
        return "redirect:/presentation/producto/show";
    }
}
