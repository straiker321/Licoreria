
package pe.idat.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.demo.entity.categorias;

        
public interface categoriaaRepository extends JpaRepository<categorias, Long>{
    @Query("Select c from categoriaa c where c.estado='1'")
    List<categorias> findAllCustom();
}
