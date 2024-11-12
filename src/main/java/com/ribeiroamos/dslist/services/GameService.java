package com.ribeiroamos.dslist.services;

import com.ribeiroamos.dslist.dto.GameDTO;
import com.ribeiroamos.dslist.dto.GameMinDTO;
import com.ribeiroamos.dslist.entities.Game;
import com.ribeiroamos.dslist.projections.GameMinProjection;
import com.ribeiroamos.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //Bloqueia o banco de dados para escrita otimizando o banco de dados.
    @Transactional(readOnly = true)
    public GameDTO findByID(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

        //fazer tratamento de excessão para quando nao existir o id.
    }

    //Chama o repository, consulta o banco com todos os objetos e converte em GameMinDTO.
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
