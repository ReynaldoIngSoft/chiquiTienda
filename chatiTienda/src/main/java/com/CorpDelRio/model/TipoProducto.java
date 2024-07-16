package com.CorpDelRio.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "tbTipoProducto")
@Data
@NoArgsConstructor
public class TipoProducto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtipoprodu")
	private int idtippoprodu;
	
	@NotNull(message = "El nombre no puede ser nulo")
	@Size(min = 1, max = 20, message = "el nombre debe ser coherente")
	private String nombretipo;
	
	
	}
