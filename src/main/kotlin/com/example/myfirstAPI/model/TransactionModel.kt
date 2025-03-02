package com.example.myfirstAPI.model

import jakarta.persistence.*


@Entity
@Table(name="Transaction")
open class TransactionModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Int = 0,
    val targetAccount : String,
    val value : Double,
    val description: String = ""

)