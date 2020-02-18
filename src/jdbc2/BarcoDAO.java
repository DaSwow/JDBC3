
package jdbc2;

import java.util.List;


public interface BarcoDAO {
        Barco find(int id) throws Exception;
    List<Barco> getAll() throws Exception;
    void add(Barco barco) throws Exception;
    void update(Barco barco) throws Exception;
    void delete(int id) throws Exception;
    
    
    
}
