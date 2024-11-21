package com.example.mongoproyectosp.Documentos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Productos")
public class Productos {

	@Id
	private int id;
	
	private String Nombre;
	private String Descripcion;
	private double Precio;
	private int CantStock;
	private int CodigoProd;
	
	public Productos(int id, String Nombre, String Descripcion,double Precio,int CantStock,int CodigoProd){
		
		super();
		this.id=id;
		this.Nombre=Nombre;
		this.Descripcion=Descripcion;
		this.Precio=Precio;
		this.CantStock=CantStock;
		this.CodigoProd=CodigoProd;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public int getCantStock() {
		return CantStock;
	}
	public void setCantStock(int cantStock) {
		CantStock = cantStock;
	}
	public int getCodigoProd() {
		return CodigoProd;
	}
	public void setCodigoProd(int codigoProd) {
		CodigoProd = codigoProd;
	}

	

	
	
}
