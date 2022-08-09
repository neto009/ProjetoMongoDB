package com.example.demo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document(collation = "gameCollection")
public class Game {
    @Id
    private String id;
    private String name;
    private String category;
    private Integer minAge;

    private String costumerId;

    public Game(String id, String costumerId, String name, String category, Integer minAge) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.minAge = minAge;
    }

    public String getCostumerId() {
        return costumerId;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }
}
