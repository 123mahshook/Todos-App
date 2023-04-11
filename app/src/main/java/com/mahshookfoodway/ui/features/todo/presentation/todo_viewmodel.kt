package com.mahshookfoodway.ui.features.todo.presentation

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mahshookfoodway.ui.features.todo.data.APIService
import com.mahshookfoodway.ui.features.todo.model.Todo
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import kotlinx.coroutines.launch

class TodoViewModel : ViewModel() {
    private val _todoList = mutableStateListOf<Todo>()
    var errorMessage: String by mutableStateOf("")
    val todoList: List<Todo>
        get() = _todoList

    fun getTodoList() {
        viewModelScope.launch {
            val apiService = APIService.getInstance()
            try {
                _todoList.clear()
                _todoList.addAll(apiService.getTodos())

            } catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}