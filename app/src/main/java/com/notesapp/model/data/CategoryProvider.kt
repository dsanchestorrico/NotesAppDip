package com.notesapp.model.data

import com.notesapp.model.entity.Category
import com.notesapp.model.entity.Note
import java.util.*

class CategoryProvider {
    companion object {
        fun getCategories(): MutableList<Category> {
            return categories
        }

        private val categories = listOf(
            Category(
                id = 1,
                name = "Personales"
            ),
            Category(
                id = 2,
                name = "Trabajo"
            ),
            Category(
                id = 3,
                name = "Favoritos"
            )
        ).toMutableList()
    }
}