package com.github.rawsanj.repository

import com.github.rawsanj.entity.Person
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import java.util.stream.Stream

/**
 * Created by Sanjay on 10/12/2017.
 */

@RepositoryRestResource
interface PersonRepository : MongoRepository<Person, String> {

    @Query("{}")
    fun all(): Stream<Person>
}