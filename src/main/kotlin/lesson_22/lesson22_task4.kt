package org.example.lesson_22

class MainScreenViewModel() {

    var state: MainScreenState = MainScreenState()

    fun loadData() {
        state = state.copy(data = null)
        state = state.copy(isLoading = true)
        state = state.copy(data = "Data from server", isLoading = false)
    }
}

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false,
)
