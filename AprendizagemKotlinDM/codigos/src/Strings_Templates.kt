fun main(){
    val name = "Rômulo"
    println("Hello " + name + " !")
    // Esse metódo de concatenação é utilizado no Java.

    println("Hello $name !")
    //Usando o recurso do template:

    println("Hello \$name !")
    //Com a barra invertida anula o template:

    println(" A soma é : ${soma(a=10,b=20)}")
    // Usando o template na expressão:

}
fun soma (a:Int, b:Int) : Int{
    return a + b
}