
package com.tienda.tienda.model;

@data
@Entity
        @Table(name=credito)
public class credito implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ID
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Colum(name="id_credito")
    private Long idCredito;
            private Long limite;
            
            
            public credito() {
            }

            
            
}
