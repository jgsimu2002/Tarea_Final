
package com.tienda.tienda.model;

@data
@Entity
        @Table(name=credito)
public class categoria implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ID
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Colum(name="id_categoria")
    private Long idCredito;
    private String descripcion;
            private boolean activa;
            
            
            public categoria() {
            }

    public categoria(String descripcion, boolean activa) {
        this.descripcion = descripcion;
        this.activa = activa;
    }


            
            
}
