package com.devsuperior.exercicio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.exercicio.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
