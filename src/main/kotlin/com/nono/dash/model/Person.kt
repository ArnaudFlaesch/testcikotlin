package com.nono.dash.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Person(
        @Id
        val id : Number,
        val name: String,
        val address: String
)
