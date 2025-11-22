package Lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

class MainScreenViewModel {
    private val _mainScreenState = MainScreenState("---abstract data---")
    lateinit var mainScreenState: MainScreenState

    fun loadData() {
        Thread.sleep(1000)
        mainScreenState = _mainScreenState
            .copy(data = null)
        println(mainScreenState)

        Thread.sleep(1000)
        mainScreenState = _mainScreenState
            .copy(data = null, loadingStatus = true)
        println(mainScreenState)

        Thread.sleep(1000)
        mainScreenState = _mainScreenState
            .copy(loadingStatus = false)
        println(mainScreenState)
    }
}

data class MainScreenState(val data: String?, val loadingStatus: Boolean = false)