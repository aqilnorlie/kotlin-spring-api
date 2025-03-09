package com.example.myfirstAPI.controller

import com.example.myfirstAPI.model.CustomerModel
import com.example.myfirstAPI.service.CustomerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class CustomerController (private val customer_service: CustomerService) {

    @GetMapping("/all")
    fun getCustomer(): MutableList<CustomerModel> = customer_service.getAll()

}