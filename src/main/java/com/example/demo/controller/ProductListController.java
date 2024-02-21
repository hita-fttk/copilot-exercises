package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Product;

@Controller
@RequestMapping("/product")
public class ProductListController {
    private List<Product> list = new ArrayList<>();
    Product product1 = new Product("商品1", 100, "食品");
    Product product2 = new Product("商品2", 200, "食品");
    Product product3 = new Product("商品3", 300, "食品");
    Product product4 = new Product("商品4", 400, "食品");


    @GetMapping("")
    public String productList() {
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        return "list-products";
    }
}
