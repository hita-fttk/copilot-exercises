package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping("")
    public String login() {
        return "login";
    }

    //このクラスでは、ログイン情報をセッションスコープに保存するメソッドを作成し、ログインが成功したらユーザー情報を表示するページにリダイレクトさせてください。
    //こーどをかいてください
    @PostMapping("/login")
    public String login(String name,String password, Model model) {
        if(name.equals("user") && password.equals("pass")){
            model.addAttribute("name",name);
            return "user/info";
        }else{
            return "login";
        }
    }
}
