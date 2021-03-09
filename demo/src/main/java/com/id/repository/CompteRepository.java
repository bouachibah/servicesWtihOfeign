package com.id.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.id.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {
 
}
