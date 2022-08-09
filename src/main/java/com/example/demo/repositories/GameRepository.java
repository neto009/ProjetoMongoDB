package com.example.demo.repositories;

import com.example.demo.entities.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game, String> {
}
