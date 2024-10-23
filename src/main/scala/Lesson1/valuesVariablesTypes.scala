package Lesson1

object valuesVariablesTypes extends App{
    val my_int: Int = 42            //represented with 32 bits    
        //You don't have to declare a type
        //It will give an error if you put in a value that is not of the type you declared
        //vals are immutable

    val my_string: String = "Hello"
    val my_Boolean: Boolean = true
    val my_char: Char = 'a'
    val my_short: Short = 4613      //represented with 16 bits instead of 32
    val my_long: Long = 1231251513234L    //represented with 64 bytes instead of 32
    val my_float: Float = 2.1f            //represented with 32 bits
    val my_double: Double = 3.14          //represented with 64 bits

    var my_var: Int = 4
    my_var = 100
    println(my_var)

}


