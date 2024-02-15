package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class FavoriteBookController {
    /*[favorite-book.html]`にフォワードさせる`showFavoriteBook()`メソッドを作成してください */
    @RequestMapping("/show-favorite")
    public String showFavoriteBook() {
        return "favorite-book";
    }
}
