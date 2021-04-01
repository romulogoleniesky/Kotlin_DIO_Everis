//01/04/2021- Expressões.
fun main() {
    println(max(a = 10,b = 5))
    println(max1(a = 10,b = 5))
    println(max2(a = 10,b = 5))
}

// Corpo do Bloco:
fun max(a:Int, b:Int):Int {
    return if (a > b) a else b
}
// Corpo de expressão:
fun max1(a:Int, b: Int):Int = if (a>b) a else b

//Também podemos omitir a declaração do tipo Inteiro:
fun max2(a:Int, b: Int) = if (a>b) a else b