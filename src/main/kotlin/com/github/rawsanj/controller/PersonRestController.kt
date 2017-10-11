package com.github.rawsanj.controller

import com.github.rawsanj.repository.PersonRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Sanjay on 10/12/2017.
 */

@RestController
class PersonRestController(val personRepository: PersonRepository) {

    @GetMapping("/person")
    fun persons() = personRepository.findAll()

}