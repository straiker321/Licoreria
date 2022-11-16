
package pe.idat.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.demo.entity.ventas;


public interface VentasRepository extends JpaRepository<ventas, Long>{
    @Query("Select v from ventas v where v.estado='1'")
    List<ventas> findAllCustom();
}
