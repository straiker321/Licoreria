/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.demo.entity.productos;

/**
 *
 * @author Harold Mallma
 */
public interface productosRepository extends JpaRepository<productos, Long>{
    @Query("Select p from productos p where p.estado='1'")
    List<productos> findAllCustom();
}
