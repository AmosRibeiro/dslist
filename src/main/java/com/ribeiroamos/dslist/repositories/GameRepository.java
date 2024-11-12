package com.ribeiroamos.dslist.repositories;

import com.ribeiroamos.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//Consulta no banco de dados utilizando o framework pronto
public interface GameRepository extends JpaRepository<Game, Long> {

}
