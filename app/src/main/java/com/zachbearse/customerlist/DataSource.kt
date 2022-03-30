package com.zachbearse.customerlist

class DataSource {
    fun loadCustomers(): List<Customer> {
        return listOf(
            Customer(
                "Zach",
                "Bearse",
                "(860)712-1824",
                "40 Kingsbury Ln",
                "Glastonbury",
                "CT"
            ),
            Customer(
                "Harry",
                "Potter",
                "(987)654-3210",
                "The Cupboard under the Stairs, 4 Privet Drive",
                "Little Whinging",
                "SR"
            ),
            Customer(
                "Sherlock",
                "Holmes",
                "(123)456-7890",
                "221b Baker St",
                "London",
                "UK"
            ),
            Customer(
                "Big",
                "Bird",
                "(111)222-3333",
                "123 Sesame St",
                "Big City",
                "ST"
            ),
            Customer(
                "John",
                "Doe",
                "(756)5685-4682",
                "7547 Greenwood Dr",
                "Anytown",
                "NY"
            )
        )
    }
}