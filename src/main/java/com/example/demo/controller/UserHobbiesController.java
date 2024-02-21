package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
// このクラスでは、フォームから送信されたユーザー名と趣味のリストを受け取り、それを次の画面に渡すメソッドを作成してください
public class UserHobbiesController {
    @GetMapping("")
    public String userHobbies() {
        return "user-hobbies-form";
    }

    @PostMapping("/userHobbies")
    public String userHobbies(String userName, String[] hobbies, Model model) {
        model.addAttribute("userName", userName);
        model.addAttribute("hobbies", hobbies);
        return "show-hobbies";
    }

}
