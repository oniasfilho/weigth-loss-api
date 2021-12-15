package io.oniasfilho.weightlossapi.repository;

import io.oniasfilho.weightlossapi.model.Peso;
import org.springframework.data.repository.CrudRepository;

public interface PesoRepository extends CrudRepository<Peso, Integer> {
}
