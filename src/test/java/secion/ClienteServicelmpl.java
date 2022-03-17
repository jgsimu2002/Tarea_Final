
package secion;

import com.tienda.tienda.dao.clientedao;
import com.tienda.tienda.model.cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicelmpl implements ClienteServise {

    @Autowired
    @Transactional(readOnly = true)
    public List<cliente> getCliente() {
       private clientedao clientedao;

    @Override
    public void save(cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void detele(cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public cliente getCliente(cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

    @Override
    @Transactional
    public list <cliente> getCliente() {
        return (List<cliente>) clientedao.fiendAll();
    }

    @Override
    @Transactional
    public void save(cliente cliente){
        clientedao.save(cliente);
    }

    @Override
    @Transactional
   public void detele(cliente cliente){
        clientedao.detele(cliente);
    }

 @Override
 @Transactional(readOnly = true)
 public cliente getCliente(cliente cliente){
return clientedao.findAll.fiendByID(cliente.getCliente()).orElse(null);
    }
    
    
}
