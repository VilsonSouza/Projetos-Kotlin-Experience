

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var nome:String,var idade:String,var formacao: Formacao)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60,var nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)

    }
}

fun main() {
    val conteudo1= ConteudoEducacional("engenharia de software",240,Nivel.INTERMEDIARIO)
    val conteudo2= ConteudoEducacional("Ingles",120,Nivel.INTERMEDIARIO)
    val conteudo3= ConteudoEducacional("Banco de Dados",120,Nivel.INTERMEDIARIO)
    val conteudosList:MutableList<ConteudoEducacional> = mutableListOf(conteudo1,conteudo2,conteudo3)




    val formacao = Formacao("ADS",conteudosList)
    val usuario = Usuario("Cleiton","17",formacao)
    println(usuario)

}