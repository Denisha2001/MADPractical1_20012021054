/*fun main(){
    fun opration(op:Char, vararg numarray:Int):Int {
        when(op) {
            '+' -> {
                for (num in numarray)
                    println("sum of num1 and num2 is")
            }
            '%' -> {
                for (num in numarray)
                    println("division of num1 and num2 is")
            }
            '*' -> {
                for (num in numarray)
                    println("multiplication of num1 and num2 is")
            }
            '-' -> {
                for (num in numarray)
                    println("subtraction of num1 and num2 is")
            }

        }
    return -1}
}*/

fun main() {
    val add =add(6,3)
    val mns =minus(6,3)
    val multi =multiply(6,3)
    val div =division(6,3)
    println("a is 6 and b is 3")
    println("Addition is :$add")
    println("minus is :$mns")
    println("multipliction :$multi")
    println("division :$div")
}
fun add( num1:Int , num2:Int ):Int
{
    return num1+num2
}
fun minus( num1:Int , num2:Int ):Int
{
    return num1-num2
}
fun multiply( num1:Int , num2:Int ):Int
{
    return num1 * num2
}
fun division( num1:Int , num2:Int ):Int
{
    return num1/num2
}

