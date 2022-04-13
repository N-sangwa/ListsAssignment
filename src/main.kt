fun main(){
 var list =listOfStrings(listOf("Nadine","Hilda","Super","Belyse","Pascaline","Nadege","Cadeau","Bruno", "Bakhita","Tanyasis"))
println(list)
 var height = HeightOfPeople(listOf(1.57,1.70,1.54,1.78))
 println(height)
 var lyn = Person("Lyn",22,1.60,60)
 var linda = Person("Linda",30,1.58,60)
 var nadine = Person("Nadine",4,1.57,63)

 var girls = listOf(lyn,linda,nadine)
 var people = girls.sortedByDescending { p -> p. age}
 println(people)

 var sakina = Person("Sakina",3,1.75,55)
 var hilda= Person("Hilda",6,1.60,84)

 var allPeople= mutableListOf(sakina,hilda)
 println(allPeople.plus(list))

 var toyota = Car("RAA 123",10)
 var benz= Car("RAD 605",50)
 var rangeRover = Car("RAE 254",50)

 var myOwnCars = listOf(toyota,benz,rangeRover)
 println(carMileage(myOwnCars))


}

fun listOfStrings(lists:List<String>):List<String>{
 var people = mutableListOf<String>()
 lists.forEachIndexed{ index, list ->
  if ((index%2)==0){
   people.add(list)
  }
 }
 return people
}




fun HeightOfPeople(heightInmeters:List <Double>):String{
 var height = heightInmeters.sum()
 var average = heightInmeters.average()
 var HeightAndAverage = "The Total height is $height and average height is $average"
 return HeightAndAverage
}

data class Person(var name:String,var age:Int,var height:Double,var weight:Int)

fun sortDescending( persons:List<String>){
}

data class Car(var registration:String,var mileage:Int)

fun carMileage(mileage:List<Car>):Int{
 var total1=0
 mileage.forEach { y->y.mileage
  total1+=y.mileage
 }
 var total=total1/mileage.count()
 return total1
}





























































































