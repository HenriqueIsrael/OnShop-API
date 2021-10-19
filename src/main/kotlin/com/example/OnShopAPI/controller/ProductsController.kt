package com.example.OnShopAPI.controller

import com.example.OnShopAPI.model.Id
import com.example.OnShopAPI.model.Product
import com.example.OnShopAPI.service.ProductsService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductsController(private val productsService: ProductsService){
    @GetMapping("/{id}")
    fun getProducts(@PathVariable id: Int):List<Product>{
        return productsService.getProducts(id)
    }
}