package com.example.myfirstAPI.controller

import com.example.myfirstAPI.dto.TransactionDTO
import com.example.myfirstAPI.model.TransactionModel
import com.example.myfirstAPI.service.TransactionService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/transfer")
class TransferController (private val transactionService: TransactionService){


    @PostMapping("/new")
    fun newTransfer(@RequestBody transactionModel: TransactionModel) : ResponseEntity<String> {
            try{
                transactionService.save(transactionModel)
                return ResponseEntity("Updated", HttpStatus.OK)
            }catch (e : Exception){
                return ResponseEntity(e.message, HttpStatus.BAD_REQUEST)
            }
    }

    @GetMapping("/all")
    fun getAllTransfers() : List<TransactionModel>{

        return transactionService.getAll()
    }

    @GetMapping("/{transactionID}")
    fun getTransfers(@PathVariable transactionID: Int) : TransactionModel{
        return transactionService.getTransaction(transactionID)
    }

    @GetMapping("/dto/all")
    fun getAllTransfersDTO(): List<TransactionDTO>{
        return transactionService.getAllTransactions()
    }
}