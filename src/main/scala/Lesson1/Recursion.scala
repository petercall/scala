package Lesson1
import scala.annotation.tailrec

object Recursion extends App{
  
    def factorial(n: Int): BigInt = 
        @tailrec
        def factHelper(x: Int, accumulator: BigInt): BigInt = 
            if (x<=1) accumulator
            else factHelper(x-1, x*accumulator)
        
    
        factHelper(n,1)

    // println(factorial(10000))

    def string_concat(my_str: String, n: Int): String = 
        @tailrec
        def concatenator(my_str: String, x: Int, int_str: String): String = 
            if (x==1) int_str else concatenator(my_str, x-1, int_str + my_str)

        concatenator(my_str, n, my_str)

    // println(string_concat("This", 3))

    def is_prime(n: Int): Boolean = 
        @tailrec
        def is_prime_until(t: Int): Boolean = 
            if (t <=1) true else if (n%t == 0) false else is_prime_until(t-1)    

        is_prime_until(n/2)

    // println(is_prime(2007))

    def fib(n: Int): Int = 
        if (n<=1 || n<=2) 1 
        else            
            @tailrec
            def fib_int(t: Int, a: Int, b: Int): Int = 
                if (t == n) b 
                else fib_int(t+1, b, a+b)
    

            fib_int(2,1,1)

    println(fib(5))

}
