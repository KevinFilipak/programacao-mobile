import kotlin.math.roundToLong

fun main() {
    print("Digite um valor em R$: ")
    val valor = readLine()!!.toDouble()

    val moedas = intArrayOf(100, 50, 25, 10, 5, 1)
    var resto = (valor * 100).toInt()

    for (i in moedas.indices) {
        val numMoedas = resto / moedas[i]
        resto %= moedas[i]

        val moeda = (moedas[i].toFloat()/100)
        println("$moeda * $numMoedas")
    }
}