
package jdbc2;

import java.util.List;



public interface SocioDAO {
    Socio find(int id) throws Exception;
    List<Socio> getAll() throws Exception;
    void add(Socio socio) throws Exception;
    void update(Socio socio) throws Exception;
    void delete(int id) throws Exception;
}
