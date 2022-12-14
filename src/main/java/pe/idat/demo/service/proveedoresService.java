
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.proveedores;

public interface proveedoresService {
    //funcion para mostrar todos los distritos
	 List<proveedores> findAll();
	 //funcion para mostrar los distritos habilitados
	 List<proveedores> findAllCustom();
	 //funcion para buscar un distrito por codigo
	 Optional<proveedores> findById(Long id);
	 //funcion para registrar
	 proveedores add(proveedores p);
	 //funcion para actualizar
	 proveedores update(proveedores p);
	 //funcion para eliminar
	 proveedores delete(proveedores p);
}
