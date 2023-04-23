package com.goulartDev.domain.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;	

import com.goulartDev.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
