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

fun main(){
    val instant = Instant.now()
    val a = Instant.ofEpochSecond(-99999)
    println(a)

    val b = LocalDate.of(2023, 9, 1)

    val c = LocalDate.of(2025, 5, 31)

    val d = Period.between(b, c)
    println(d)

    val e = Period.of(2,3,24)
    println(c + e)

    val f = ZonedDateTime.of(2025,12,22,10,0, 0, 0, ZoneId.of("Europe/Moscow"))

    val g = LocalDate.of(2025, 12, 22)
    val h = LocalTime.of(10,0,0)

    val dateSum = ZonedDateTime.of(g, h, ZoneId.of("Europe/Moscow"))

    val i = g.atTime(h).atZone(ZoneId.of("Europe/Moscow"))

    val j = i.plusDays(11).plusHours(5)

    val k = DateTimeFormatter.ofPattern("'Days:' dd, 'Hours:' HH ")
    println(j.format(k))

    val l = e.multipliedBy(2)
    println(l)

}