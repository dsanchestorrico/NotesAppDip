package com.notesapp.model.data.dao

import androidx.room.*
import com.notesapp.model.entity.Category

@Dao
interface CategoryDao {
    @Query("SELECT * FROM categories_table")
    suspend fun getAll(): List<Category>

    @Query("SELECT * FROM categories_table WHERE id = :id")
    suspend fun getById(id: Int): Category

    @Update
    suspend fun update(category: Category)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(category: List<Category>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(category: Category)

    @Delete
    suspend fun delete(category: Category)
}