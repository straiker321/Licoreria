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
import pe.idat.demo.entity.proveedores;
import pe.idat.demo.service.proveedoresService;

@RestController
@RequestMapping("/proveedores")
public class proveedoresRestcontroller {
    @Autowired
    private proveedoresService service;
    
    @GetMapping
    public List<proveedores> findAll(){
        return service.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<proveedores> findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping("/custom") 
    public List<proveedores> findAllCustom(){
        return service.findAllCustom(); 
    } 
    
    @PostMapping
    public proveedores add(@RequestBody proveedores p){ 
        return service.add(p); 
    }
    
    @PutMapping("/{id}")
    public proveedores update(@PathVariable long id, @RequestBody proveedores p) {
    	p.setId_proveedores(id);
    	return service.update(p);
    }
    @DeleteMapping("/{id}")
    public proveedores delete(@PathVariable long id) {
    	proveedores objprov = new proveedores();
    	objprov.setEstado(false);
        return service.delete(proveedores.builder().id_proveedores(id).build());    	
    }
}
