package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
public class FavoriteMovieController {
    /*[favorite-movie.html]`にリダイレクトさせる`showFavoriteMovie()`メソッドを作成してください */
    @RequestMapping("/show-favorite")
    public String showFavoriteMovie() {
        return "redirect:/movie/favorite-movie.html";
    }
    
}
