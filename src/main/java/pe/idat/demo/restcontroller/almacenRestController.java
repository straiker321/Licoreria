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
import pe.idat.demo.entity.almacen;
import pe.idat.demo.service.almacenService;

/**
 *
 * @author Harold Mallma
 */
@RestController
@RequestMapping("/almacen")
public class almacenRestController {
    
    @Autowired
    private almacenService servicio;
    
     @GetMapping
    public List<almacen> findAll() {
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<almacen> findAllCustom() {
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<almacen> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }
    
    @PostMapping
    public almacen add (@RequestBody almacen a) {
        return servicio.add(a);
    }
    
   @PutMapping("/{id}")
    public almacen update (@PathVariable long id_almacen, @RequestBody almacen a) {
        a.setCodigo(id_almacen);
        return servicio.update(a);
    }
    
    @DeleteMapping("/{id}")
    public almacen delete (@PathVariable long id_almacen) {
        almacen objalmacen = new almacen();
        objalmacen.setEstado(false);
        return servicio.delete(almacen.builder().codigo(id_almacen).build());
    }
    
    
}
