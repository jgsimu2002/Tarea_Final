
package secion;

import com.tienda.tienda.model.cliente;
import java.util.List;


public interface ClienteServise {
    
    public List<cliente> getCliente();
    public void save(cliente cliente);
    public void detele (cliente cliente);
    public cliente getCliente (cliente cliente);
    
    
}
