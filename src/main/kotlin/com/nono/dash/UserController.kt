package com.nono.dash

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping("/user")
    fun blog(): String {
        return "blog"
    }

}