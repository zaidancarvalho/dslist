package com.devsuperior.delist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.delist.dto.GameDTO;
import com.devsuperior.delist.dto.GameMinDTO;
import com.devsuperior.delist.entities.Game;
import com.devsuperior.delist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		 return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
