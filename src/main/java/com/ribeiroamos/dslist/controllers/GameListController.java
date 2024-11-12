package com.ribeiroamos.dslist.controllers;

import com.ribeiroamos.dslist.dto.GameDTO;
import com.ribeiroamos.dslist.dto.GameListDTO;
import com.ribeiroamos.dslist.dto.GameMinDTO;
import com.ribeiroamos.dslist.services.GameListService;
import com.ribeiroamos.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
