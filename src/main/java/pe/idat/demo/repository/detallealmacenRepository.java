/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.demo.entity.detallealmacen;

/**
 *
 * @author Harold Mallma
 */
public interface detallealmacenRepository extends JpaRepository<detallealmacen, Long>{
    @Query("Select da from detallealmacen da  where da.estado='1'")
    List<detallealmacen> findAllCustom();
    
}
