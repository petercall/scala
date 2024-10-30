package Lesson2

import scala.compiletime.ops.string

object OOBasics extends App {
  
    //Define your authors
    val Dickens = new Writer("Charles", "Dickens", 1812)
    val Austen = new Writer("Jane", "Austen", 1775)

    //Define your novels
    val OliverTwist = new Novel("Oliver Twist", 1838, Dickens)
    val TaleofTwoCities = new Novel("A Tale of Two Cities", 1859, Dickens)
    val PrideandPrejudice = new Novel("Pride and Prejudice", 1813, Austen)
    val NewOliverTwise = OliverTwist.copy(1842)
    // println(NewOliverTwise.yearOfRelease)
    // println(NewOliverTwise.name)
    // println(NewOliverTwise.author.fullName())


    // println(PrideandPrejudice.isWrittenBy(Dickens))
    // println(PrideandPrejudice.isWrittenBy(Austen))


    var my_counter = counter()
    println(my_counter.currentCount)
    println(my_counter.CurrentCount)
    // my_counter = my_counter.inc()
    // my_counter = my_counter.inc()
    // my_counter = my_counter.inc()
    // my_counter = my_counter.dec()
    // println(my_counter.CurrentCount)
    // my_counter = my_counter.inc(100)
    // println(my_counter.currentCount)


}


class Writer(val firstName: String, val surname: String, val yearOfBirth: Int) {

    def fullName(): String = firstName + " " + surname
    
}

class Novel(val name: String, val yearOfRelease: Int, val author: Writer) {

    val authorAge: Int = yearOfRelease - author.yearOfBirth

    def isWrittenBy(author: Writer): Boolean = (author == this.author)

    def copy(newYearOfRelease: Int): Novel = new Novel(name, newYearOfRelease, author)


}
