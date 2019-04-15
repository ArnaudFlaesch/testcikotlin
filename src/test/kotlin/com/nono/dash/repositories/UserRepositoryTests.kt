package com.nono.dash.repositories

import com.nono.dash.model.Person
import com.nono.dash.repositories.PersonRepository

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension


@SpringBootTest
@ExtendWith(SpringExtension::class)
class UserRepositoryTests(@Autowired val repo: PersonRepository) {

    @Test
    fun `basic entity checks`() {
        val p = Person(1,"Paul", "HelloStreet")
        repo.save(p)
        assertThat(repo.findAll()).hasSize(1)
        assertThat(repo.getByAddress("test")).isNull()
    }
}