package com.ribeiroamos.dslist.services;

import com.ribeiroamos.dslist.dto.GameListDTO;
import com.ribeiroamos.dslist.entities.GameList;
import com.ribeiroamos.dslist.projections.GameMinProjection;
import com.ribeiroamos.dslist.repositories.GameListRepository;
import com.ribeiroamos.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    //Chama o repository, consulta o banco com todos os objetos e converte em GameMinDTO.
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

    // Muda a posição dos jogos na lista.
    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);
        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
