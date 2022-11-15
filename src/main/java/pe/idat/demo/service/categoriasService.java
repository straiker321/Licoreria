/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.categorias;

public interface categoriasService {
    	//funcion para mostrar todos los distritos
	 List<categorias> findAll();
	 //funcion para mostrar los distritos habilitados
	 List<categorias> findAllCustom();
	 //funcion para buscar un distrito por codigo
	 Optional<categorias> findById(Long id_categoria);
	 //funcion para registrar
	 categorias add(categorias c);
	 //funcion para actualizar
	 categorias update(categorias c);
	 //funcion para eliminar
	 categorias delete(categorias c);
}
