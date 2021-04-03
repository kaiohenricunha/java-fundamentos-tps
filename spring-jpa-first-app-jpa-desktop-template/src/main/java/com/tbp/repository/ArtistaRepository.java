package com.tbp.repository;

import com.tbp.modelo.Artista;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends CrudRepository<Artista, Integer>{
       
    List<Artista> findByNomeIgnoreCaseContaining(String nome);
}
