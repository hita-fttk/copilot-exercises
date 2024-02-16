package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserInfoController {
    
    @GetMapping("/info")
    public String userInfo() {
        return "user/info";
    }
    // このクラスでは、フォームから送信されたデータをリクエストスコープに保存し、それを表示するメソッドを作成してください

    @PostMapping("/show-info")
    public String userInfo(String name,String age, Model model) {
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "user/info";
    }
}
