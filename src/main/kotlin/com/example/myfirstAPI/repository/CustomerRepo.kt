package com.example.myfirstAPI.repository

import com.example.myfirstAPI.model.CustomerModel
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepo:JpaRepository<CustomerModel, Int> {

}