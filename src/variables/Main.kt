// variables
fun main() {
    //"val" can’t be reassigned a different value after initialization
    val firstName2 : String ="Ali"          //Equal  -> val firstName ="Ali"
    println(firstName2)

    val myAge : Int = 21                      //Equal -> val myAge =21
    println(myAge)



    println("=========================")

    //"var" can be reassigned a different value after initialization
    var firstName : String  ="Omar"
    firstName = "ami"
    println(firstName)
    println(firstName.isEmpty())

    var lastName ="Mohamed"
    println(lastName)

    var gender  = ""
    println(gender.isEmpty())

    var age =20
    println(age)


    println("========================")

    var car:String = "BMW"

    var car2 : String = "BMW"
    println(car2::class)

    var number : Int = 25
    println(number.javaClass)  // To now dataType
    }
