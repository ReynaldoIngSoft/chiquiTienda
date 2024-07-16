package com.CorpDelRio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbProveedor")
public class Proveedor {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproveedor;
	private int rucproveedor;
	private String nombreprove;
	private String direccionprove;
	private int telefono;
}
