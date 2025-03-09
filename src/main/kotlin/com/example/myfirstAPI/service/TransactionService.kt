package com.example.myfirstAPI.service

import com.example.myfirstAPI.dto.TransactionDTO
import com.example.myfirstAPI.mapper.TransactionMapper.toTransactionDTO
import com.example.myfirstAPI.model.TransactionModel
import com.example.myfirstAPI.repository.TransactionRepo
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class TransactionService(private val transactionRepo: TransactionRepo) {

    fun getAll(): List<TransactionModel> = transactionRepo.findAll()

    @Transactional
    fun save(transactionModel: TransactionModel) = transactionRepo.save(transactionModel)

    fun getTransaction(transactionID: Int): TransactionModel {
        return transactionRepo.findById(transactionID)
            .orElseThrow { NoSuchElementException("Transaction not found with ID: $transactionID") }
    }

    fun getAllTransactions(): List<TransactionDTO> {
        val transactions = transactionRepo.findAll()
        return transactions.map { toTransactionDTO(it) }
    }

    fun getTransactionById(id: Int): TransactionDTO? {
        val transaction = transactionRepo.findById(id).orElse(null)
        return transaction?.let { toTransactionDTO(it) }
    }

}