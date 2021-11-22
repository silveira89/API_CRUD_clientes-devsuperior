package com.devsuperior.API_CRUD_clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.API_CRUD_clientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
