package com.ribeiroamos.dslist.repositories;

import com.ribeiroamos.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
