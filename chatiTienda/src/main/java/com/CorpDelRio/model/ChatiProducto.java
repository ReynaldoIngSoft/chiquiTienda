package com.CorpDelRio.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;


@Entity
@Table(name="tb_productos")
@Data
@NoArgsConstructor
public class ChatiProducto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprodu")
	private int  idprodu;
	
	
	@NotNull(message = "El genero no puede ser nulo")
	@Pattern(regexp = "M|F", message = "El género debe ser 'M' o 'F'")
	@Column(name = "generoprodu", nullable = false)
    private Genero genero;
	
	@NotNull(message = "El nombre no puede ser nulo")
	@Size(min=4, max= 80, message = "El nombre del producto debe ser coherente")
	@Column(name = "nombreprodu", length =80)
    private String nombreprodu;
	
	
	@NotNull(message = "El precio de venta no puede ser nulo")
	@PositiveOrZero(message = "El precio de venta debe ser positivo o cero")
	@Column(name = "precioventaprodu")
    private double precioventa;
	
	
	@NotNull(message = "el valor no puede ser nulo")
	@PositiveOrZero(message = "El precio de la compra no puede ser negativo")
	@Column(name = "preciocompraprodu")
    private double preciocompra;
	
	
	@NotNull(message = "La cantidad no puede ser nula")
	@Min(value = 0, message = "La cantidad debe ser al menos 0")
	@Column(name = "cantidad")
    private int cantidad;
	
	@NotNull(message = "El ID no puede ser nulo")
	@Column(name = "idtipoprodu")
    private int idtipoprodu;
	
	@NotNull(message = "El Id no puede ser nulo")
	@Column(name = "idproveedor")
    private int idproveedor;
    
    @ManyToOne(fetch =FetchType.EAGER)
    @JoinColumn(name="idtipoprodu", insertable = false, updatable = false)
    private TipoProducto objTipo;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idproveedor", insertable = false, updatable = false)
    private Proveedor objProveedor;
    
    public enum Genero{
        M, F
    }
}
