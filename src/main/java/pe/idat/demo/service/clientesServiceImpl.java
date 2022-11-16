/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.idat.demo.entity.clientes;
import pe.idat.demo.repository.clientesRepository;

@Service
public class clientesServiceImpl implements clientesService{

    @Autowired
    private clientesRepository repositorio;
    
    @Override
    public List<clientes> findAll() {
          return repositorio.findAll();
    }

    @Override
    public List<clientes> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public Optional<clientes> findById(Long id_cliente) {
         return repositorio.findById(id_cliente);
    }

    @Override
    public clientes add(clientes c) {
        return repositorio.save(c);
    }

    @Override
    public clientes update(clientes c) {
        clientes objcli= repositorio.getById(c.getId_cliente());
        BeanUtils.copyProperties(c, objcli);
        return repositorio.save(objcli);
    }

    @Override
    public clientes delete(clientes c) {
        clientes objcli= repositorio.getById(c.getId_cliente());
        objcli.setEstado(false);
        return repositorio.save(objcli);
    }
    
}
