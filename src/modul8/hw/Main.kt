package modul8.hw

import kotlin.time.Duration
import kotlin.time.DurationUnit
import kotlin.time.ExperimentalTime

@OptIn(ExperimentalTime::class)
fun main() {
    val convertedValue = Duration.convert(
        value = 3.0,
        sourceUnit = DurationUnit.DAYS,
        targetUnit = DurationUnit.HOURS
    )
    println(convertedValue)

    val isoDuration = Duration.parseIsoString("PT74H15M8S")
        .toComponents{
                hours, minutes, seconds, _ ->
            println("Duration $hours $minutes $seconds") // 74, 15, 8
        }
    println(fromTextToSec("1h2m3s"))

    println(changeToHours(3723))
    println(changeToMinutes(3600))
    println(changeToSeconds(3723))
}

private fun fromTextToSec(value: String): Long{
    return Duration.parseIsoString("PT0" + value.uppercase()).inWholeSeconds
}

fun changeToHours(value: Long) = value / 3600
fun changeToMinutes(value: Long) = value % 3600 / 60
fun changeToSeconds(value: Long) = value % 60