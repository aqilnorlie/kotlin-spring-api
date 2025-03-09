package com.example.myfirstAPI.service

import com.example.myfirstAPI.model.CustomerModel
import com.example.myfirstAPI.repository.CustomerRepo
import org.springframework.stereotype.Service

@Service
class CustomerService (private val customer_repo: CustomerRepo){

    fun getAll(): MutableList<CustomerModel> = customer_repo.findAll()

}