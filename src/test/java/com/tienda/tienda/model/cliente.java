
package com.tienda.tienda.model;

@data
@Entity
        @Table(name=cliente)
public class cliente implements Serializable {
    
    private static final log serialVersionUID = 1L;
    
    @ID
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;
            private String nombre;
            private String apellidos;
            private String correo;
            private String telefono;
            
            public cliente() {
            }

    public cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
            
            
}
