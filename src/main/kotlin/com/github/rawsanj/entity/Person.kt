package com.github.rawsanj.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by Sanjay on 10/12/2017.
 */

@Document
data class Person(var first: String? = null,
                    var last: String? = null,
                    @Id var id: String? = null)