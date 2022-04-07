
package com.tienda.tienda.controles;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class ArticuloController {
    @Autowired
    private ArticuloService articuloService;
    
     @Autowired
    private CategoriaService categoriaService;
     
     @GetMapping("/articulo/listado")
     public String inicio(Model model){
       var articulos=articuloService.getArticulos(false)
     model.addAtribute("articulos",articulos);
     return "/articulo/listado";
     
     @GetMapping("/articulo/nuevo")
     public String nuevoArticulo(Articulo articulo, Model model) {
      var categorias=categoriaService.getCategorias(true);   
     model.addAllAttributes("categorias",categorias);
     return "/articulo/modifica";
     
     }
     @GetMapping("/articulo/modificar/idArticulo")
     public String modificarArticulo(Articulo articulo, Model model){
         var categorias=categoriaService.getCategorias(true);
         model.addAllAttributes("categorias",categorias)
         
     }}
     
}
