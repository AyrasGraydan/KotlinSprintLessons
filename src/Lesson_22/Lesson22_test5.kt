package Lesson_22
import java.time.LocalDateTime

fun main() {
    val info = """Cостоит из двух близких солнцеподобных звёзд, 
        |Альфа Центавра A и B, которые образуют двойную систему,
        |и более тусклого красного карлика, Проксимы Центавра,
        |который является самой близкой звездой к нашей планете. """.trimMargin()

    val starSystem = GalacticGuide(
        "",
        info,
        LocalDateTime.now(),
        4.367f
    )

    val (_, description) = starSystem
    println( description )
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: LocalDateTime,
    val distance: Float
)