package com.devsuperior.delist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.delist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
