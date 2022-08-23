fun main() {
    var al = listOf(1, 267,76,35,9, 8, 5, 2)
    var mn:Int
    mn=al[0]
    for (i in al) {
        if(mn<i)
        {
            mn=i
        }
    }
    println("Largest  number is: $mn")
}