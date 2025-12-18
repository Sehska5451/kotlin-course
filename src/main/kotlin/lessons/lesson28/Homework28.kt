package main.kotlin.lessons.lesson28

import java.time.Instant
import java.time.LocalTime
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.Clock
import java.time.ZonedDateTime
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.time.Period
import java.time.Duration
import java.time.temporal.ChronoUnit
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal
import java.time.temporal.ChronoField
import java.time.Month

fun ex4(temporal: Temporal): String {
    val hasDate = temporal.isSupported(ChronoField.YEAR)
    val hasTime = temporal.isSupported(ChronoField.HOUR_OF_DAY)
    val hasSeconds = temporal.isSupported(ChronoField.SECOND_OF_MINUTE)
    val hasZone = temporal.isSupported(ChronoField.OFFSET_SECONDS)

    val pattern = buildString {
        if (hasDate) append("yyyy-MM-dd")
        if (hasDate && hasTime) append(" ")
        if (hasTime) {
            append("HH:mm")
            if (hasSeconds) append(":ss")
        }
        if (hasZone) append(" XXX")
    }

    return DateTimeFormatter.ofPattern(pattern).format(temporal)
}

//Создайте функцию identifyGeneration, которая расширяет класс LocalDate и печатает строку, определяющую,
// к какому поколению принадлежит человек родившийся в эту дату: "Бумер" для тех, кто родился с 1946 по 1964 год включительно,
// и "Зумер" для тех, кто родился с 1997 по 2012 год включительно. Если дата рождения не попадает ни в один из этих диапазонов,
// функция должна печатать "Не определено".
// Для сравнения дат используй методы isAfter(otherDate) и isBefore(otherDate) или проверку вхождения в диапазон.
// Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.

private val BOOMER_START = LocalDate.of(1946, Month.JANUARY, 1)
private val BOOMER_END = LocalDate.of(1964, Month.DECEMBER, 31)
private val ZOOMER_START = LocalDate.of(1998, Month.JANUARY, 1)
private val ZOOMER_END = LocalDate.of(2012, Month.DECEMBER, 31)

fun LocalDate.identifyGeneration(): String {
    return when (this) {
        in BOOMER_START..BOOMER_END -> "Boomer"
        in ZOOMER_START..ZOOMER_END -> "Zoomer"
        else -> "Did not identifyed"
    }
}

fun main() {
//Создай текущую метку времени и выведи её на печать (чтобы ещё раз запомнить название этого класса)
    val todayDate = LocalDate.now()

//Создай дату своего дня рождения.
    val dateOfBirth = LocalDate.of(1997, 4, 12)

//Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.
    val yearsOfLiving = Period.between(dateOfBirth, todayDate)
    println(yearsOfLiving)

//Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того,
// содержит ли аргумент время и часовой пояс. Temporal - это общий тип для разных классов даты-времени.
// В форматированном значении нужно выводить часы, минуты, секунды и таймзону,
// если они представлены в переданном объекте. Обработай в методе все типы дат, которые знаешь.
// Реализуй два варианта функции - с собственный форматированием и с форматами из ISO коллекции.
    val ex4 = ex4(dateOfBirth)
//Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше.
// Не используй в них метод now()
    val dateOfLeaving = ZonedDateTime.of(
        2022,
        9,
        25,
        14,
        0,
        0,
        0,
        ZoneId.of("Asia/Novosibirsk")
    )

    val generationIdentification = dateOfBirth.identifyGeneration()
    println(generationIdentification)


//Создай два объекта даты:
// 25 февраля 2023 года и
// 25 февраля 2024 года.
// Создай форматтер, который форматирует дату в месяц и день.

    val a = LocalDate.of(2023, 2, 25)
    val b = LocalDate.of(2024, 2, 25)

    val formatterForDates: DateTimeFormatter? = DateTimeFormatter.ofPattern("'Year:' yyyy 'Month:' MM, 'Day:' dd ")
    println(a.format(formatterForDates))
    println(b.format(formatterForDates))
//Выведи первую отформатированную дату, прибавив к ней 10 дней.
    val formattedA = a.plusDays(10)
    println(formattedA)

//Выведи вторую отформатированную дату, прибавив к ней 10 дней. Найди отличия)))
    val formattedB = b.plusDays(10)
    println(formattedB)
}
