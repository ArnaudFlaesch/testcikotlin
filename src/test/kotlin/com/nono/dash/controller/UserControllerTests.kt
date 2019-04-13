package com.nono.dash.controller

import com.nono.dash.UserController
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTests(@Autowired val userController: UserController) {

    @Test
    fun test() {
        assertThat(userController.blog()).isEqualTo("blog")
    }
}