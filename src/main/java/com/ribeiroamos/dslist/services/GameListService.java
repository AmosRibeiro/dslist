package com.ribeiroamos.dslist.services;

import com.ribeiroamos.dslist.dto.GameListDTO;
import com.ribeiroamos.dslist.entities.GameList;
import com.ribeiroamos.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    //Chama o repository, consulta o banco com todos os objetos e converte em GameMinDTO.
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
