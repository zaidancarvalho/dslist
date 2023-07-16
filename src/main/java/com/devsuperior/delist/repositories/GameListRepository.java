package com.devsuperior.delist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.delist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
