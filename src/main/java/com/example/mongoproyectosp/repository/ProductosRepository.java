package com.example.mongoproyectosp.repository;
import com.example.mongoproyectosp.Documentos.Productos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductosRepository extends MongoRepository<Productos, Integer> {

}
