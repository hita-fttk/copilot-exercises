package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.FavoriteFoodForm;

@Controller
@RequestMapping("/food")
public class FavoriteFoodController {
    /*このクラスでは、フォームから送信される好きな食べ物の情報を受け取り、それをコンソールに出力する処理を実装してください */
    @RequestMapping("/show-favorite")
    public String showFavoriteFood(String food) {
        System.out.println(food);
        return "favorite-food";
        
    }
    /*、`FavoriteFoodForm`を使用してフォームからのデータを受け取り、コンソールに出力するメソッドを追加してください */
    @RequestMapping("/show-favorite")
    public String showFavoriteFood(FavoriteFoodForm form) {
        System.out.println(form.getFood());
        return "favorite-food";
    }
}
