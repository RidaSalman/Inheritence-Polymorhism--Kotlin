import java.awt.Shape

//---------------------------------Basic Inheritence Example
/*open class Phone(){
    val name : String = ""
    val type : String = " "
    val volume : Int = 10

    fun makecall(){}
    fun display(){}
    fun powerOff(){}
    fun getDeviceInfo(){}
}*/
//---------------------------
/*open class Parent{
    init {
        println("Parents Constructor is called")
    }
    val name : String = ""
    fun mymethod(){
        println("I am in Parent")
    }
}
class Child : Parent(){
    init {
        println("Child Constructor is called")
    }
    val name2 : String = ""
    fun mymethod2(){
        println("I am in child")
    }
}*/
/*
fun main() {
    val obj = Child()
}*/
//-----------------------------Over riding in Inheritence
/*
open class Mobile (val type : String)
{
    open val name: String= ""
    open val size :Int  = 5
    fun makeCall() = println("Calling From Mobile")
    fun poweroff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class Oneplus(type1 : String) : Mobile(type1){

    override val name: String = "SDS"
    override val size: Int =  10
    override fun display() {
        super.display()
        println("One plus Display")
    }

    override fun toString(): String {
        return "Name - $name - Size - $size"
    }

}
fun main(){
    val oneplus = Oneplus("fsfsfs")
    oneplus.display()
    println("Name  = ${oneplus.name}")
    val mob = Mobile("sdfsf")
    mob.display()
    println(oneplus.toString())
}*/
//----------------------------------Polymorphism---------------------
/*open class shape(){
    open fun area() : Double{
        return 0.0

    }

    override fun toString(): String {
        return " I am shape"
    }
}
fun calculateArea(shape1: Array<shape>){
    for (shape in shape1){
        println(shape.area())
    }

}
class Circle(val radius: Double) : shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }


}
class  Square(val side : Double) : shape(){
    override fun area(): Double {
        return side * side
    }
}
class triangle(val base : Double, val height : Double): shape(){
    override fun area(): Double {
        return 0.5 * base * height
    }
}
fun main(){
    val circle = Circle(4.9)
    val sq = Square(2.3)

    val shapes = arrayOf(Circle(3.0),triangle(3.0, 4.0), Square(4.0))
    calculateArea(shapes)
    println(circle.toString())
}*/
//--------------------------------Inheritence
/*open class Person (val name:String, val age:Int?){
    init{
        println("Here you can do something at object initialize")
    }
    open fun walk(){
        println("I am walking person")
    }
}
class Employee(val salary: Double,name:String, age:Int):
    Person(name,age){
    override fun walk() {
        println("I am walking employee")
    }
}
fun main(){
    var emp = Employee(name = "John", salary = 10000.00, age = 35)
    println("Employee details name : ${emp.name}, age : ${emp.age}, Salary : ${emp.salary}")
    emp.walk()
}*/
//---------------------Inheritence
/*
open class Person(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class MathTeacher(age: Int, name: String): Person(age, name) {

    fun teachMaths() {
        println("I teach in primary school.")
    }
}

class Footballer(age: Int, name: String): Person(age, name) {
    fun playFootball() {
        println("I play for LA Galaxy.")
    }
}

fun main(args: Array<String>) {
    val t1 = MathTeacher(25, "Jack")
    t1.teachMaths()

    println()

    val f1 = Footballer(29, "Christiano")
    f1.playFootball()
}*/
//-----------------------------abstract
/*
abstract class shape (){
    var name : String = ""
    abstract fun area() : Double
    abstract fun display()
}

class Circle (val radius : Double) : shape(){
    override fun area(): Double  = Math.PI * radius * radius
    override fun display() {
        println("Circle is getting displayed")
    }

}
abstract class A {
    fun method1(){
        println("qdadada")
    }
}
fun main(){

    val circle = Circle(4.0)
    println(circle.area())
    circle.display()
}*/
//---------------------------------------Interface
interface draggable{

    fun drag()
}
interface clonable{
    fun clone()
}
fun dragoject(objects : Array<draggable>){//shape
    for(obj in objects){
        obj.drag()
    }
}
abstract class shape () : draggable{
    var name : String = ""
    abstract fun area() : Double
}

class Circle (val radius : Double) : shape(){
    override fun area(): Double  = Math.PI * radius * radius
    override fun drag() {
        println("Circle is getting displayed")
    }

}
abstract class A {
    fun method1(){
        println("qdadada")
    }
}
fun main(){

    dragoject(arrayOf(Circle(4.0), Player("shfbj")))
}

class Player(val name : String): draggable{
    override fun drag() {
        println("$name is dragging")
    }
}