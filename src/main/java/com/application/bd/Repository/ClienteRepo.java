package com.application.bd.Repository;

import com.application.bd.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends CrudRepository<Cliente,Integer> {




}

