package com.team15.sidedish.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BestDishesDTO {
    @JsonProperty("best_dishes")
    private List<BestDTO> bestDishes;

    public BestDishesDTO(List<BestDTO> bestDishes) {
        this.bestDishes = bestDishes;
    }

    public List<BestDTO> getBestDishes() {
        return bestDishes;
    }

    @Override
    public String toString() {
        return "BestDishesDTO{" +
                "bestDishes=" + bestDishes +
                '}';
    }
}


