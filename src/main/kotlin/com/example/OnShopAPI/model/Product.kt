package com.example.OnShopAPI.model

data class Product(
    val id: Int,
    val image: String,
    val name : String,
    val description: String,
    val price: Double,
    val categoryId: Int
)