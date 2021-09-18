package com.constructores.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.constructores.entities.Estado;

public interface EstadoDAO extends JpaRepository<Estado, Integer> {

}
