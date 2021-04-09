class pessoas(
    val nome : String,
    val idade : Int
)
fun main(){
    val pessoa1: pessoas = pessoas("romulo",  32)
    val pessoa2: pessoas = pessoas("sophia",  10)

    println("Pessoa 1 :  ${pessoa1.nome}, ${pessoa1.idade}")
    println("Pessoa 2 :  ${pessoa2.nome}, ${pessoa2.idade}")

}