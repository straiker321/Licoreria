
package pe.idat.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.demo.entity.categoriaa
        
public interface categoriaaRepository extends JpaRepository<categoriaa, Long>{
    @Query("Select c from categoriaa c where c.estado='1'")
    List<categoriaa> findAllCustom();
}
