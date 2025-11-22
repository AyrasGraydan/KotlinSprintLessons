package Lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

class MainScreenViewModel {
    private val _mainScreenState = MainScreenState("---abstract data---")
    var mainScreenState = MainScreenState(null)

    fun loadData() {
        Thread.sleep(1000)
        mainScreenState =_mainScreenState
            .copy(data = null)
        println(mainScreenState)

        Thread.sleep(1000)
        mainScreenState = mainScreenState
            .copy(isLoading = true)
        println(mainScreenState)

        Thread.sleep(1000)
        mainScreenState = _mainScreenState
            .copy(data = _mainScreenState.component1(),isLoading = false)
        println(mainScreenState)
    }
}

data class MainScreenState(val data: String?, val isLoading: Boolean = false)