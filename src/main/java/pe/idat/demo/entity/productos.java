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
@Entity(name="productos")
@Table(name="productos")
public class productos implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="precio")
    private String precio;
    
    @ManyToOne
    @JoinColumn(name="id_categoria", nullable =false)
    private categorias categoria;
    
    @ManyToOne
    @JoinColumn(name="id_proveedores", nullable =false)
    private proveedores proveedor;
    
    @Column(name="estpro")
    private boolean estado; 
    
    
    
}
