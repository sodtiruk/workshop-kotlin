
fun sum (a:Int, b:Int): Int{
    return a + b
}

fun fizzbuzz(number :Int): String{
    if (number.mod(3) == 0 && number.mod(5) == 0)
        return "fizzbuzz"
    else if (number.mod(3)  == 0)
        return "fizz"
    else if (number.mod(5) == 0)
        return "buzz"
    return "nothing"
}



fun main(args: Array<String>) {

    // var cannot reassign value but val you can do
    var x:Int = 2
    var j = 3
    val a :Int = 1

    val text = "Hello"
    println(text.uppercase())

    var ten = 10
    println("10 + 1 = ${ten+1}")

    //data class
    // you can create data class in function main or  out function main
    data class Person(var name:String, var age:Int)

    val lucky = Person("beta", 1)
    println(lucky)


    //function
    /*
    fun sum (a:Int, b:Int): Int{
       return a+b
    }
     */
    // but you can do this
    fun sum(a:Int, b:Int):Int = a+b

    //if expression
    var number:Int = 2
    if (x == 2){
        println("x is equal 2")
    }else {
        println("x is not equal 2")
    }

    //
    fun sum2(a:Int, b:Int) =
        if (a > b) {
            a
        }else {
            b
        }

    //when expression
    // this is same as switch_case in java
    when(x) {
        1 -> println("one")
        2 -> println("two")
    }

    //&& vs and
    /* if (a and b ) {

    }
     */

    //|| vs or

    //loop for
    // you can loop data_structer
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
    // if you want index
    for (index in items.indices){
        println("Index $index is ${items[index]}")
    }

    //null
    //null if you add ? in last word ,you can assign value is null
    val nullableText1:String? = "Hello world"
    val nullableText2:String? = null
    println(nullableText1)

    //Safe calls
    val strA: String? = "Kotlin"
    val strB: String? = null
    println(strA?.length)
    println(strB?.length)

    //Unsafe calls
//    val strC: String? = "Kotlin"
//    val strD: String? = null
//    println(strC?.length)
//    println(strD!!.length)

    println(fizzbuzz(15))

}

