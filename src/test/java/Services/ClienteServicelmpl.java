
package Services;

import com.tienda.tienda.dao.clientedao;
import com.tienda.tienda.model.cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicelmpl implements ClienteServise {

    @Autowired
    private clientedao clientedao;
@Autowired
    private CreditoDao creditodao;

    }

    @Override
    @Transactional
   public void save(cliente cliente) {
        Credito credito = cliente.getCredito();
        credito=creditoDao.save(credito);
        cliente.setCredito(credito);
        clientedao.save(cliente);
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
