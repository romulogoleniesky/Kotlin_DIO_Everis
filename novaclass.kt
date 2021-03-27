//Criando uma class

class Pessoa {
    var nome: String = "Rômulo"
    var cpf: String = "123.123.123-00"

    inner class Endereco{
        var rua: String = "Rua Carlos"
    }
}

fun main(){
    val Romulo = Pessoa()

    println(Romulo.nome)
    println(Romulo.cpf)
}