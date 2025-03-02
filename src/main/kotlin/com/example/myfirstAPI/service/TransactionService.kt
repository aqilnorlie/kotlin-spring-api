package com.example.myfirstAPI.service

import com.example.myfirstAPI.model.TransactionModel
import com.example.myfirstAPI.repository.TransactionRepo
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class TransactionService(private val transactionRepo: TransactionRepo) {

    fun getAll(): List<TransactionModel> = transactionRepo.findAll()

    @Transactional
    fun save(transactionModel: TransactionModel) = transactionRepo.save(transactionModel)
}