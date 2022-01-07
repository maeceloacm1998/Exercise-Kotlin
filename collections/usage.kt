package collections

import com.sun.org.apache.xpath.internal.operations.Bool

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes(val nome: String, val quantidade: Int)

fun searchIngredientes(list: List<Ingredientes>, name: String): Boolean{
    return list.any { it.nome == name };
}

fun main() {

    // Cria lista de dados
    val data = listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Farinha", 1),
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )

    // Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim" else "não"}")

    // Quantas receitas tenho na coleção?
    println("Eu tenho no total ${data.count()} receitas")

    // Tenho alguma receita de Lasanha?
    println("Tenho receita de lasanha? ${if (data.any { it.nome.contains("Lasanha") }) "sim" else "não"}")

    // Quantas receitas de Lasanha?
    println("Tenho no total ${data.count { it.nome.contains("Lasanha") }} receitas de lasanha.")

    // Qual a primeira e última receita?
    val dataSize = data.size
    println("A primeira receita e ${data.first().nome}")
    println("A primeira receita e ${data.last().nome}")

    // Qual a soma de calorias?
    val calorias = data.sumOf(Receita::calorias)
    println("O Total de calorias e $calorias")

    // Me dê as duas primeiras receitas
    val firstTwo = data.take(2)
    for (receitas in firstTwo.withIndex()) {
        println("Na posicao ${receitas.index + 1} temos a receita ${receitas.value.nome}")
    }

    // Sei como fazer panqueca? E sushi?
    val filterPancake = data.filter { it.nome.contains("Panqueca") }.any()
    val filterSushi = data.filter { it.nome.contains("Sushi") }.any()

    println(if(filterPancake) "Eu sei fazer panqueca" else "Eu nao sei fazer panqueca")
    println(if(filterSushi) "Eu sei fazer sushi" else "Eu nao sei fazer sushi")

    // Quais são as comidas com mais de 500 calorias?
    val filterFoodMaxCalorie = data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    // Por [chave e valor], quais comidas tem mais de 500 calorias?
    data.filter { it.calorias > 500 }.map { Pair(it.nome, it.calorias) }. forEach { println("${it.first}: ${it.second}") }

    // Qual das receitas contem farinha como ingrediente?
    data.filter { searchIngredientes(it.ingredientes, "Farinha")}.forEach { println(it.nome) }

    // Qual a receita mais calórica? E a menos calórica?

    // Faça uma lista com o nome dos pratos

    // Qual a média de calor de todas as receitas?

    // Lista de dados simples

    // Eliminar receitas com mesmo nome

    // Ordenar uma lista

    // Inverter uma lista

}