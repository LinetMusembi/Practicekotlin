//Data classes
//A kotlin data class is only used to hold data and does not do anything else other than just holding data.

//How to remove duplicates from a string
//use district()
//use toSet()

//If you want to transform a given collection into a single unit then you can use the reduce function()
fun main() {
    val fruits = arrayOf("mangoes","oranges","pineapples","kiwi","sugarcane","mangoes","oranges","kiwi")
    println(fruits.distinct())
    val games = arrayOf("football","netball","football","netball")
    println(games.toSet())

    val numList = listOf(1,2,23,4,5)
    var result = numList.reduce{result,item ->
        result +item
    }
    println(result)


    val numbers = listOf(9,8,7,6,5,4,3)




    println( compareStrings("ann","banana"))
    println( compareStrings("georgia","kisumu"))
    println(compareStrings("georgia","albania"))

    println( find(arrayOf(1,2,3,4,5,6,7,8,9)))
    character("passion")
    println( joinArrayToString(arrayOf("ann","is","a","girl")))

    greetings("Irene")
    knowMe()

    substract(20,10)

    var text = "mountain"
    println(text[0])
    println(text[1])
    println(text[2])

    println(mySelf("Lynet",18))

    var message = "lynet is a boy"
    var message2 = "lynet is a boy"
    if(message == message2) {
        println(true)
        var message = "football is a game"
        var message2 = "football is fun"
        if (message == message2) {
            println(true)
        } else {
            println(false)
        }

    }
    val x = "my name is linet musembi"
    println(x.toUpperCase())
    println(x.toLowerCase())
    println(x.capitalize())
    println(x.decapitalize())

    add()

}
fun greetings(name: String){
    println("Hello"+ name)

}
fun multiplication(num1: Int,num2: Int,num3:Int,num4:Int,):Int{
    var product= (num1 * num2 * num3 * num4)
    return product
}
fun substract(num1:Int,num2:Int){
    var difference = num1 - num2
    println(difference)

}
fun mySelf(name: String,age:Int):String {
    var name = "lynet"
    var age = 18
    return("Hi,my name is $name and I am $age years old ")

}
fun modulus(num1: Int,num2: Int,num3: Int,num4: Int):Int{
    var division = num1 % num2 * num3 * num4
    return division

}
fun add(){
    var a = 3
    var b = 4
    var sum = a + b
    println(sum)
}
fun knowMe(){

    val name = "ann"
    val year = "1980"
    val sentence = "my name is $name and i was born in the year $year"
    println(sentence) }

fun compareStrings(strg1:String,strg2:String): Char{
    if (strg1.length>=strg2.length){
        return strg1[0]
    }
    else{
        return strg2[0]
    }

}
data class MinMaxAvarage(val minimum:Int,val maximum:Int,val avarage:Double) {
}

fun find(numbers:Array<Int>):MinMaxAvarage{
    val minimum = numbers.min()
    val maximum = numbers.max()
    val avarage = numbers.average()
    val result = MinMaxAvarage(minimum,maximum,avarage)
    return result

}
fun character(word:String){
    println(word.split(""))

}
fun joinArrayToString(words:Array<String>):String{
    var outPut = " "
    for (word in words){
        outPut += word
    }
    return outPut
}









