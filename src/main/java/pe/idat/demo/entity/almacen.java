/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.idat.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Harold Mallma
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="almacen")
@Table(name="almacen")
public class almacen implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_almacen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="stock")
    
    @ManyToOne
    @JoinColumn(name="id_proveedor", nullable =false)
    private proveedores proveedor;
    
    @ManyToOne
    @JoinColumn(name="id_detallle_almacen", nullable =false)
    private detallealmacen detallealmacen;
    
    private String stock;
    @Column(name="estal")
    private boolean estado; 
    
    
    
    
}
