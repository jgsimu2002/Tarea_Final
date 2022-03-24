
package com.tienda.tienda.controles;

import Services.ArticuloService;
import com.tienda.tienda.dao.clientedao;
import static java.lang.Math.log;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import Services.ClienteServise;
import org.springframework.ui.Model;

@Controles
@SIf4j
public class index_controles {
    
    @Autowired
    private ArticuloService ArtuculoService;
    
    @GetMapping("/")
    public String inicio (Model model) {
    var articulos=ArticuloService.getArticulos(true);
    model.addAttribute("articulos",articulos);
    return"index";
    }
    

        
     

                       
    }
    
