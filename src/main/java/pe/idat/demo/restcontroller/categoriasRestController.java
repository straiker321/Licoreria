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

import pe.idat.demo.entity.categorias;
import pe.idat.demo.service.categoriasService;

/**
 *
 * @author Harold Mallma
 */
@RestController
@RequestMapping("/categorias")
public class categoriasRestController {
    
   @Autowired
    private categoriasService servicio;
    
    @GetMapping
    public List<categorias> findAll() {
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<categorias> findAllCustom() {
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<categorias> findById(@PathVariable Long id) {
        return servicio.findById(id);
    }
    
    @PostMapping
    public categorias add (@RequestBody categorias c) {
        return servicio.add(c);
    }
    
    @PutMapping("/{id}")
    public categorias update (@PathVariable long id, @RequestBody categorias c) {
        c.setCodigo(id);
        return servicio.update(c);
    }
    
    @DeleteMapping("/{id}")
    public categorias delete (@PathVariable long id) {
        categorias objcategorias = new categorias();
        objcategorias.setEstado(false);
        return servicio.delete(categorias.builder().codigo(id).build());
    }
    
}

