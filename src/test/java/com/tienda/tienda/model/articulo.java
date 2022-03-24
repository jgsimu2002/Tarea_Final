
package com.tienda.tienda.model;

import java.io.Serializable;
import javax.print.DocFlavor;

@data
@Entity
        @Table(name=credito)
public class articulo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ID
    @GenerateValue(strategy = GenerationType.IDENTITY)
    @Colum(name="id_articulo")
    private Long idCategoria;
    private String descripcion;
    private String detalle;
    private Double precio;
    private int existencia;
    private Boolean activo;
            
            
            public articulo() {
            }

    public articulo(String descripcion, String detalle, Double precio, int existencia, Boolean activa) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencia = existencia;
        this.activa = activa;
    }

   
            
}
