
package pe.idat.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.demo.entity.factura;


public interface FacturaRepository extends JpaRepository<factura, Long>{
    @Query("Select f from factura f where f.estado='1'")
    List<factura> findAllCustom();
}
