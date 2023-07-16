package com.devsuperior.delist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.delist.dto.GameMinDTO;
import com.devsuperior.delist.entities.Game;
import com.devsuperior.delist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		 return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
}
