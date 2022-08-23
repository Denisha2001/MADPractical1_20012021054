tailrec fun fact(n:Int):Int{
    if(n==1){
        return 1
    }
    return n*fact(n-1)
}
fun main(){
    print("Enter a number:")
    var num:Int = readLine()!!.toInt()
    println("Factorial Of $num is ${fact(num)}")
}