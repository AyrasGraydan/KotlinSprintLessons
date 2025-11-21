package Lesson_22

fun main() {
    val mainScreenState = MainScreenState("---abstract data---")
    val viewModel = MainScreenViewModel(mainScreenState)
    viewModel.loadData()
}

class MainScreenViewModel(val mainScreenState: MainScreenState) {
    fun loadData() {
        Thread.sleep(1000)
        println("отсутствие данных")
        Thread.sleep(1000)
        val mainScreenStateLoading = mainScreenState.copy(isLoading = true)
        println("загрузка данных")
        Thread.sleep(1000)
        val mainScreenStateEnd = mainScreenStateLoading.copy(isLoading = false)
        println("наличие загруженных данных")
    }
}

data class MainScreenState(val data: String, val isLoading: Boolean = false)