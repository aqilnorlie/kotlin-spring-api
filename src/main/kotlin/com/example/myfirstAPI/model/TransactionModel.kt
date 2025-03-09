package com.example.myfirstAPI.model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*


@Entity
@Table(name="Transaction")
open class TransactionModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int = 0,
    val targetAccount : String,
    val value : Double,
    val description: String = "",

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonBackReference
    val customer: CustomerModel

)