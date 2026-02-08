package org.example.lesson_22

class MainScreenViewModel(var mainScreenState: MainScreenState) {

    fun loadData() {
        mainScreenState = mainScreenState.copy(data = "Нет данных")
        mainScreenState = mainScreenState.copy(isLoading = true)
        mainScreenState = mainScreenState.copy(isLoading = false)
    }
}

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false,
)
