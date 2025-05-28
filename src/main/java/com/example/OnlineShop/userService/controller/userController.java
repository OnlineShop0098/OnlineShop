package com.example.OnlineShop.userService.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("api/user")
@Tag(name="User API", description = "Operation Related to CRUD user")
public class userController {

    @Operation(summary = "for testing", description = "return a string so i know  the endpoint work")
    @GetMapping
    public String testing(){
        return "hello world";
    }
}
