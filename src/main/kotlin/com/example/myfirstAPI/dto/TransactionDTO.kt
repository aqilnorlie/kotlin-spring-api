package com.example.myfirstAPI.dto

data class TransactionDTO(
    val id: Int,
    val targetAccount: String,
    val value: Double,
    val description: String,
    val customer: CustomerDTO // Only basic customer info
)
