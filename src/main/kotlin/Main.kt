fun main() {
var car = Vehicle("Mazda","C5",2020)
    car.drive()
    var talk = Person("Saru",21,"female")
    talk.speak()


    var miniCar = Car("toyota","3x",2018)
    println(miniCar.startEngine("voom"))
    var minicycle = Motorcycle("honda","bluex",2023)
    println(minicycle.startEngine("vruuum"))
}
//Q1-Create a class called Vehicle with properties make, model, and year, and a method drive().
// The drive() method should print a message indicating that the vehicle is being driven.
class Vehicle(var make: String, var model: String, var year: Int){
    fun drive(){
        println("vrooom!!!")
    }
}
//Q1-Create a class named Person with properties for name, age, and gender.
// Add a method named speak that prints "Hello, my name is {name}".
class Person(var name: String, var age: Int, var gender: String){
    fun speak(){
        println("Hello,my name is $name")
    }
}
//Q1-Create an abstract class named Vehicle with properties for make, model, and year.
// Add an abstract method named startEngine.
// Create subclasses for Car and Motorcycle that implement the startEngine method differently.
open class Vehicle2(var make: String, var model: String, var year: Int) {
    open fun startEngine(sound: String):String {
        var sond="vuum"
        return sond
    }
}
    class Car(make: String, model: String, year: Int): Vehicle2(make,model,year){
        override fun startEngine(sound: String): String{
            return sound
        }
    }
    class Motorcycle(make: String, model: String, year: Int): Vehicle2(make,model,year){
       override fun startEngine(sound: String): String{
           return sound

        }
    }
