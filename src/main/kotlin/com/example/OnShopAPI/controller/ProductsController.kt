package com.example.OnShopAPI.controller

import com.example.OnShopAPI.model.Product
import com.example.OnShopAPI.service.ProductsService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductsController(private val productsService: ProductsService){
    @GetMapping
    fun getProducts():List<Product>{
        return productsService.getProducts()
    }
}