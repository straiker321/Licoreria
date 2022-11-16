/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.demo.entity.almacen;

/**
 *
 * @author Harold Mallma
 */
public interface almacenRepository extends JpaRepository<almacen, Long>{
    @Query("Select a from almacen a where a.estado='1'")
    List<almacen> findAllCustom();
}
