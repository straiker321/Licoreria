
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
	 Optional<categorias> findById(long id_categoria);
	 //funcion para registrar
	 categorias add(categorias c);
	 //funcion para actualizar
	 categorias update(categorias c);
	 //funcion para eliminar
	 categorias delete(categorias c);
}
