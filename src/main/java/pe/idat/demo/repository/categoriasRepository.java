
package pe.idat.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
<<<<<<< Updated upstream:src/main/java/pe/idat/demo/repository/categoriasRepository.java
import pe.idat.demo.entity.categorias;

=======
import pe.idat.demo.entity.categoriaa;
>>>>>>> Stashed changes:src/main/java/pe/idat/demo/repository/categoriaaRepository.java
        
public interface categoriasRepository extends JpaRepository<categorias, Long>{
    @Query("Select c from categoriaa c where c.estado='1'")
    List<categorias> findAllCustom();
}
