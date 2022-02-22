
package com.tienda.tienda.controles;

@controles
@SIf4j
public class index_controles {
    
    @Autowired
    private clientedao clientedao;
    
    
    
    
    @getmapping("/")
    public String inicio("se muestra la pagina del index del temp") {
        
     
    log.info("se muestra la pagina");
    
    var cliente = clientedao.findall();
           model.addAtribute("cliente",cliente)
            return "index";
    }
}
