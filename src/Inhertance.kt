fun main() {
var vehicle= Car("Mercedes Benz","SLC","Dark Grey",5)
    vehicle.carry(7)
    vehicle.identity()
println(vehicle.calculateParkingFees(9))
    var van= Bus("Ford","Freestyle","White",18)
    println(van.maxTripFare(700.00))
    println(van.calculateParkingFees(8))
}

  open class Car (var make:String, var model:String, var color:String, var capacity:Int) {
    fun carry(people: Int) {
        if (people <= capacity) {
            println("carring $people passengers")
        } else if (people >= capacity) {
            var extra = people - capacity
            println("Over capacity by $extra people")
        }
    }
    fun identity() {
        println("I am $color $make $model")
    }
     open fun calculateParkingFees(hours: Int):Int{
       var parkingFees=hours*20
       return parkingFees
     }
}
class Bus(make: String,model: String,color: String,capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare: Double):Double{
        var amountFare=capacity*fare
        return amountFare
    }
    override fun calculateParkingFees(hours: Int):Int{
        var fees=capacity*hours
        return fees
    }
}


