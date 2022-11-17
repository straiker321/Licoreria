
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import pe.idat.demo.entity.factura;


public interface facturaService {
    
   //funcion para mostrar todos los distritos
	 List<factura> findAll();
	 //funcion para mostrar los distritos habilitados
	 List<factura> findAllCustom();
	 //funcion para buscar un distrito por codigo
	 Optional<factura> findById(Long id);
	 //funcion para registrar
	 factura add(factura f);
	 //funcion para actualizar
	 factura update(factura f);
	 //funcion para eliminar
	 factura delete(factura f);
    
}
