package com.buzilov.databases5.repositories;

import com.buzilov.databases5.model.Impresario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImpresarioRepository extends CrudRepository<Impresario, Integer> {
}
