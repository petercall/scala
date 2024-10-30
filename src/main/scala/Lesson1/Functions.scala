package Lesson1

import scala.compiletime.ops.double
import scala.collection.mutable.ArrayBuffer

object Functions extends App {
    def greeting_function(name: String, age: Int): Unit = println(s"Hi my name is $name and I am $age years old")

    greeting_function("John", 25)


    def factorial(n: Int): Int = {
        if n == 1 then 1 else n * factorial(n-1)
    }

    println(factorial(5))

    def fib(n: Int): Int = {
        if n == 1 || n == 2 then 1 else
            var a: Int = 1
            var b: Int = 1
            for i <- 3 to n do
                b = a+b
                a = b
            b
    }

    println(fib(5))


    def isprime(n: Int): Boolean = 
        
        def isprimeuntil(t: Int): Boolean = 
            if (t<=1) true else n % t != 0 && isprimeuntil(t-1)
        
        isprimeuntil(n/2)

    
    val my_val: Int = if (true) 1 else 100


}
