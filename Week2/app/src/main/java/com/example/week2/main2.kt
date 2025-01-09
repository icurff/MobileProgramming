package com.example.week2

import kotlin.random.Random

fun main() {
    val car1 = Car(id = 1, model = "car1", brand = "XYZ", price = 123456.0)
    val car2 = car1.copy(id = 2, model = "car2", price = 50000.0)
    val car3 = car2.copy(id = 3, price = 170000.0,model ="car3")
    val cus = Customer(id = 43, name = "Phuc", phone = "012345678")
    val listOfCars = mutableListOf<Car>()
    listOfCars.add(car1)
    listOfCars.add(car2)
    listOfCars.add(car3)

    cus.buyCar(listOfCars[Random.nextInt(listOfCars.size)])
    cus.buyCar(listOfCars[Random.nextInt(listOfCars.size)])
    cus.buyCar(listOfCars[Random.nextInt(listOfCars.size)])


}

data class Car(var id: Int, var model: String, var brand: String, var price: Double)
class Payment(var car: Car, var finalPrice: Double)
class Customer(var id: Int, var name: String, var phone: String) {
    val boughtHistory: MutableList<Payment> = mutableListOf()
    fun buyCar(x: Car) {
        var tax: Double = 0.0
        tax = when (x.price) {
            in 0.0..50000.0 -> x.price * 0.05
            in 50001.0..150000.0 -> x.price * 0.1
            else -> x.price * 0.2
        }
        val sumPayment = x.price + tax
        val temp = Payment(x, sumPayment)
        boughtHistory.add(temp)
        println("Customer $name have paid ${x.model} with $sumPayment")
    }
}