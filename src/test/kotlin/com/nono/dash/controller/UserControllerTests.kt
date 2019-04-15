package com.nono.dash.controller

import com.nono.dash.controllers.UserController
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import io.restassured.RestAssured.given
import org.hamcrest.Matchers.equalTo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTests(@Autowired val userController: UserController) {

    @LocalServerPort
    private val port: Int = 0
    
    @Test
    fun kotlin_rest_assured_example() {
        given().
                port(port)
                .param("name", "Johan").
                `when`().
            get("/user").
                then().
                statusCode(200).
                        log().all().
                body("name", equalTo("Paul")).
                body("address", equalTo("HelloStreet"))
    }
}