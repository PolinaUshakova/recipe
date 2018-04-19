package com.banana.cinemer;

import java.io.Serializable;

/**
 * Класс для фильма.
 */
public class Recipe implements Serializable {

    public String title; // заголовок рецепта
    public String picturePath; // относительный адрес картинки с постером
    public int rating;

    public Recipe(String title, String posterPath, int rating) {
        this.title = title;
        this.picturePath = posterPath;
        this.rating = rating;
    }

}
