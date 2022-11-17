
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.clientes;

public interface clientesService {
    //funcion para mostrar todos los distritos
	 List<clientes> findAll();
	 //funcion para mostrar los distritos habilitados
	 List<clientes> findAllCustom();
	 //funcion para buscar un distrito por codigo
	 Optional<clientes> findById(Long id);
	 //funcion para registrar
	 clientes add(clientes c);
	 //funcion para actualizar
	 clientes update(clientes c);
	 //funcion para eliminar
	 clientes delete(clientes c);
}
