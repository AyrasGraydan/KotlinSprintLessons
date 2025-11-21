package Lesson_22

import Lesson_22.LoadingStatus
import kotlin.concurrent.thread

fun main() {
    val view = MainScreenState("---abstract data---")
    val viewModel = MainScreenViewModel(view)
    viewModel.loadData()

    println(view)
}

class MainScreenViewModel(val mainScreenState: MainScreenState) {
    fun loadData() {
        Thread.sleep(1000)
        val mainScreenStateLoading = mainScreenState
            .copy(loadingStatus = LoadingStatus.LOADING)
        Thread.sleep(1000)
        val mainScreenStateAvailability = mainScreenState
            .copy(loadingStatus = LoadingStatus.AVAILABILITY)
    }
}

data class MainScreenState(val data: String, var loadingStatus: LoadingStatus = LoadingStatus.ABSENCE)

enum class LoadingStatus(val description: String) {
    ABSENCE("отсутствие данных"),
    LOADING("загрузка данных"),
    AVAILABILITY("наличие загруженных данных")
}
