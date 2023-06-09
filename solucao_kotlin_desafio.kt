enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.hashCode()} matriculado na formação $nome.")
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 120)
    val conteudo3 = ConteudoEducacional("Algoritmos Avançados", 150)

    val formacao = Formacao("Formação em Kotlin", listOf(conteudo1, conteudo2, conteudo3))

    val usuario1 = Usuario()
    val usuario2 = Usuario()

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}
