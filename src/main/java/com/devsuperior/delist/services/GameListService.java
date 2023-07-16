package com.devsuperior.delist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.delist.dto.GameListDTO;
import com.devsuperior.delist.entities.GameList;
import com.devsuperior.delist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;


	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		 return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
