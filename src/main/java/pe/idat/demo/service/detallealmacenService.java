/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.detallealmacen;

/**
 *
 * @author Harold Mallma
 */
public interface detallealmacenService {
     List<detallealmacen> findAll();
	 //funcion para mostrar los distritos habilitados
	 List<detallealmacen> findAllCustom();
	 //funcion para buscar un distrito por codigo
	 Optional<detallealmacen> findById(Long iddetallealmacen);
	 //funcion para registrar
	 detallealmacen add(detallealmacen da);
	 //funcion para actualizar
	 detallealmacen update(detallealmacen da);
	 //funcion para eliminar
	 detallealmacen delete(detallealmacen da);
}
