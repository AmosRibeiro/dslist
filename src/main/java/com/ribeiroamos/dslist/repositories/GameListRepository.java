package com.ribeiroamos.dslist.repositories;

import com.ribeiroamos.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
