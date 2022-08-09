package com.example.demo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Document(collation = "costumerCollection")
public class Customer {
    @Id
    private String id;
    private String name;
    private Integer age;
    private Integer credits;
    private  List<Game> game = new ArrayList<>();

    public Customer(String id, String name, Integer age, Integer credits, List<Game> game) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.credits = credits;
        this.game = game;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public List<Game> getGame() {
        return game;
    }

    public void setGame(List<Game> game) {
        this.game = game;
    }
}
