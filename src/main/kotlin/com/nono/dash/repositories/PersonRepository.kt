package com.nono.dash.repositories

import com.nono.dash.model.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long> {
    fun getByAddress(adress: String): Person?
}