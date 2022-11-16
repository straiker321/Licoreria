/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.demo.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.idat.demo.entity.productos;
import pe.idat.demo.service.productosService;

/**
 *
 * @author Harold Mallma
 */
@RestController
@RequestMapping("/productos")
public class productosRestController {
    
     @Autowired
    private productosService servicio;
    
     @GetMapping
    public List<productos> findAll() {
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<productos> findAllCustom() {
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<productos> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }
    
    @PostMapping
    public productos add (@RequestBody productos p) {
        return servicio.add(p);
    }
    
    @PutMapping("/{id}")
    public productos update (@PathVariable long id, @RequestBody productos p) {
        p.setCodigo(id);
        return servicio.update(p);
    }
    
    @DeleteMapping("/{id}")
    public productos delete (@PathVariable long id) {
        productos objproductos = new productos();
        objproductos.setEstado(false);
        return servicio.delete(productos.builder().codigo(id).build());
    }
    
    
}
