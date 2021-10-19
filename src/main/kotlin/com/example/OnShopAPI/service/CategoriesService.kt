package com.example.OnShopAPI.service

import com.example.OnShopAPI.model.Category
import org.springframework.stereotype.Service

@Service
class CategoriesService {
    fun getCategories(): List<Category>{
        val list = listOf(
            Category(
                1,
                "Cadeiras"
            ),
            Category(
                2,
                "Notebooks"
            ),
            Category(
                3,
                "Celulares"
            ),
            Category(
                4,
                "Headsets"
            ),
            Category(
                5,
                "Mouses"
            )
        )
        return list
    }
}