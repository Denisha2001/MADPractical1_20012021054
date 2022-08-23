fun main(){
    var cars = arrayOf(
        Car("Bugatti",1,1000000,"XYZ"),

        Car("BMW",1,100000,"ABC")
    )
    var i : Int
    for(i in cars){
        println("Car-name:${i.name}, Model:${i.model},Price:${i.price},Owner:${i.owner}")
        println("Price by getCarPrice Method: ${i.getCarPrice()}")
    }
}
class Car {
    var name:String = ""
    var model:Int = 0
    var price:Int = 0
    var owner:String = ""
    constructor(name:String,model:Int,price:Int,owner:String){
        this.name = name
        this.model = model
        this.price = price
        this.owner = owner
    }
    fun getCarPrice():Int{
        return this.price
    }
}

