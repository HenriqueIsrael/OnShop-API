package com.example.OnShopAPI.controller

import com.example.OnShopAPI.model.Category
import com.example.OnShopAPI.service.CategoriesService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categories")
class CategoriesController(private val categoriesService: CategoriesService){
    @GetMapping
    fun getCategories(): List<Category>{
        return categoriesService.getCategories()
    }
}