package com.example.myfirstAPI.repository

import com.example.myfirstAPI.model.TransactionModel
import org.springframework.data.jpa.repository.JpaRepository

interface TransactionRepo: JpaRepository<TransactionModel, Int> {


}