package com.github.rawsanj

import com.github.rawsanj.entity.Person
import com.github.rawsanj.repository.PersonRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringKotlinMongoApplication {

    @Bean
    fun init(repository: PersonRepository) = CommandLineRunner {
        repository.save(Person("Jack", "Bauer"))
        repository.save(Person("Chloe", "O'Brian"))
        repository.save(Person("Kim", "Bauer"))
        repository.save(Person("David", "Palmer"))
        repository.save(Person("Michelle", "Dessler"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringKotlinMongoApplication::class.java, *args)
}
