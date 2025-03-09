package com.example.myfirstAPI.mapper

import com.example.myfirstAPI.dto.CustomerDTO
import com.example.myfirstAPI.dto.TransactionDTO
import com.example.myfirstAPI.model.TransactionModel

object TransactionMapper {
    fun toTransactionDTO(transaction: TransactionModel): TransactionDTO {
        return TransactionDTO(
            id = transaction.id,
            targetAccount = transaction.targetAccount,
            value = transaction.value,
            description = transaction.description,
            customer = CustomerDTO(
                transaction.customer.id,
                transaction.customer.name,
                transaction.customer.email
            )
        )
    }
}