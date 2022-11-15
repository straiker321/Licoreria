
package pe.idat.demo.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.demo.entity.categorias;


@RestController
@RequestMapping("/categorias")
public class categoriaaRestController {
    
    @Autowired
    private CategoriaService servicio;
    
    @GetMapping
    public List<categorias> findAll() {
        return servicio.findAll();
    }
    
}
