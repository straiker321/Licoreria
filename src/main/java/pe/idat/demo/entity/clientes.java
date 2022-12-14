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
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "clientes")
@Table(name = "clientes")
public class clientes implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion") 
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "dni")
    private String dni;
    @Column(name = "estcli")
    private boolean estado;
}
