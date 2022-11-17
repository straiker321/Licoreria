/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.almacen;

/**
 *
 * @author Harold Mallma
 */
public interface almacenService {
//funcion para mostrar todos los distritos
	 List<almacen> findAll();
	 //funcion para mostrar los distritos habilitados
	 List<almacen> findAllCustom();
	 //funcion para buscar un distrito por codigo
	 Optional<almacen> findById(Long id);
	 //funcion para registrar
	 almacen add(almacen a);
	 //funcion para actualizar
	 almacen update(almacen a);
	 //funcion para eliminar
	 almacen delete(almacen a);
}
