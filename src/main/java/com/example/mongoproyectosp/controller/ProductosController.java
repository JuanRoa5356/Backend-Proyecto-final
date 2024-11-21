package com.example.mongoproyectosp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongoproyectosp.Documentos.Productos;
import com.example.mongoproyectosp.repository.ProductosRepository;
@CrossOrigin
@RestController
@RequestMapping("/Productos")

public class ProductosController {

	@Autowired
	private ProductosRepository productoRepo;
	
	@PostMapping
	
	public ResponseEntity<?> saveProducto(@RequestBody Productos productos){
		
		try {
			Productos productosSave= productoRepo.save(productos);
			return new ResponseEntity<Productos>(productosSave, HttpStatus.CREATED);

		}catch(Exception e){
		return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}
		
		
@GetMapping
	
	public ResponseEntity<?> findAllProductos(){
		
		try {
			List<Productos> productos= productoRepo.findAll();
			return new ResponseEntity<List<Productos>>(productos, HttpStatus.OK);

		}catch(Exception e){
		return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}
		
@PutMapping

public ResponseEntity<?> updateProductos(@RequestBody Productos productos){
	
	try {
		Productos productosSave= productoRepo.save(productos);
		return new ResponseEntity<Productos>(productosSave, HttpStatus.OK);

	}catch(Exception e){
	return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

@DeleteMapping(value="/{id}")
public ResponseEntity<?> deleteProductos(@PathVariable("id") Integer id){
	
	try {
		 productoRepo.deleteById(id);
		return new ResponseEntity<String>("Fue eliminado", HttpStatus.OK);

	}catch(Exception e){
	return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

	}

