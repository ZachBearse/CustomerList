package com.zachbearse.customerlist

data class Customer(
    val firstName: String,
    val lastName: String,
    var phoneNo: String,
    var address: String,
    var city: String,
    var state: String
)