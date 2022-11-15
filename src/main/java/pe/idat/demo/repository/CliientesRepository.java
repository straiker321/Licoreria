/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.idat.demo.entity.categorias;
import pe.idat.demo.entity.clientes;


public interface cliientesRepository extends JpaRepository<clientes, Long>{
    @Query("Select c from clientes c where c.estado='1'")
    List<clientes> findAllCustom();
}
