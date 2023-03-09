fun main() {
    var car=Car("KAQ20","Toyota","black",25)
    car.carry(25)
    car.carry(30)
    car.identity()
    car.calculateParkingFees(5)
    var bus=Bus("KAZ","single deck","black",60)
    bus.maxTripFare(400.0)
    bus.calculateParkingFees(5)



}
 open class Car(var make :String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        if (people <= capacity) {
            println("carrying $people passengers")

        }
        else{
            var x= people-capacity
            println("over capacity by $x people")
        }

    }
    fun identity(){
        println("I am a $color $make$model")
    }
      open fun calculateParkingFees(hours: Int):Int{
           var parking= hours*20
            return parking
    }
}
class Bus(make: String,model: String,color: String,capacity: Int):Car(make,model,color,capacity){
     fun maxTripFare(fare: Double):Double{
         return fare*capacity



     }

    override fun calculateParkingFees(hours: Int): Int {
      //  return super.calculateParkingFees(hours)
        return hours * capacity
    }


}