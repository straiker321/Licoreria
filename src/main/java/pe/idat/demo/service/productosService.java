/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.productos;

/**
 *
 * @author Harold Mallma
 */
public interface productosService {
    //funcion para mostrar todos los distritos
	 List<productos> findAll();
	 //funcion para mostrar los distritos habilitados
	 List<productos> findAllCustom();
	 //funcion para buscar un distrito por codigo
	 Optional<productos> findById(Long id);
	 //funcion para registrar
	 productos add(productos p);
	 //funcion para actualizar
	 productos update(productos p);
	 //funcion para eliminar
	 productos delete(productos p);
    
}
