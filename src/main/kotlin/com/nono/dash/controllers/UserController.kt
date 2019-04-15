package com.nono.dash.controllers

import com.nono.dash.model.Person
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping("/user")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) : Person {
        val person = Person(1,"Paul", "HelloStreet")
        return (person);
    }

}