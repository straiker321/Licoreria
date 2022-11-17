package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.ventas;


public interface ventasService {
    //funcion para mostrar todos los distritos
	 List<ventas> findAll();
	 //funcion para mostrar los distritos habilitados
	 List<ventas> findAllCustom();
	 //funcion para buscar un distrito por codigo
	 Optional<ventas> findById(Long id);
	 //funcion para registrar
	 ventas add(ventas v);
	 //funcion para actualizar
	 ventas update(ventas v);
	 //funcion para eliminar
	 ventas delete(ventas v);
    
}
