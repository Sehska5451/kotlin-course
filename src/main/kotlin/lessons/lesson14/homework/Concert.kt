package main.kotlin.lessons.lesson14.homework

import kotlin.text.compareTo

class Concert(
    val groupName: String,
    val place: String,
    val ticketPrice: Int,
    val spaceCapacity: Int,
) {
    private var soldTickets: Int = 0
    fun info() {
        println(
                    "Group: $groupName" +
                    "Place: $place" +
                    "Ticket price: $ticketPrice" +
                    "Capacity: $spaceCapacity"
        )
    }

    fun buyTicket() {
        if(soldTickets < spaceCapacity) {
            soldTickets++
            println("You just have bought a ticket! Congratulations!")
        } else {
            println("There are no tickets because of sold out, we are really sorry!")
        }
    }
}

