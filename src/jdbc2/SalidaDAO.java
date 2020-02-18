
package jdbc2;

import java.util.List;


public interface SalidaDAO {
    
            Salida find(int id) throws Exception;
    List<Salida> getAll() throws Exception;
    void add(Salida salida) throws Exception;
    void update(Salida salida) throws Exception;
    void delete(int id) throws Exception;
    
    
    
    
}
