package Lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

class MainScreenViewModel {
    var mainScreenState = MainScreenState(null)

    fun loadData() {
        Thread.sleep(1000)
        println(mainScreenState)

        Thread.sleep(1000)
        mainScreenState = mainScreenState
            .copy(isLoading = true)
        println(mainScreenState)

        Thread.sleep(1000)
        mainScreenState = mainScreenState
            .copy(data = "---abstract data---", isLoading = false)
        println(mainScreenState)
    }
}

data class MainScreenState(val data: String?, val isLoading: Boolean = false)