
package com.tienda.tienda.controles;

import com.tienda.tienda.dao.clientedao;
import static java.lang.Math.log;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import secion.ClienteServise;

@Controles
@SIf4j
public class index_controles {
    
    @Autowired
    private ClienteServise ClienteService;
    
    
    
    
    @GetMapping("/")
    public String inicio("se muestra la pagina del index del temp") {
        
     
    log.info("se muestra la pagina");
    
    var cliente = ClienteServise.findAll();
           model.addAtribute("cliente",cliente);
            return "index";
            
            
            
                       
    }
     @GetMapping("/nuevocliente")
     public String nuevocliente (cliente cliente) {
     return "modificarcliente";
     }
     
     @PostMapping("/guardarCliente")
     public String guardarCliente(cliente cliente) {
     clienteServises.save(cliente);
     return "redirect:/";
     }
     
     @GetMapping("/modificarCliente/{idCliente}")
     public String modificarCliente(Cliente cliente , Model model) {
     cliente = clienteService.getCliente(cliente);
     model.addAtribute("cliente",cliente);
     return "modificarCliente";
     }
     
     @GetMapping("/eliminarCliente/{idCliente}")
     public String eliminarCliente(Cliente cliente , Model model) {
     cliente = clienteService.getCliente(cliente);
     model.addAtribute("cliente",cliente);
     return "redirect:/";
     
     }
}
