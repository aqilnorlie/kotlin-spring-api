package com.example.myfirstAPI.model;

import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.*;

@Entity
@Table(name = "customer")
open class CustomerModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    val name: String,
    val email: String,

    @OneToMany(mappedBy = "customer", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JsonBackReference
    val transactions: List<TransactionModel> = mutableListOf()
)
