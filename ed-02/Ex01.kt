fun main(){
    print("Digite um número: ")
    val numero = readln().toInt()

    var fatorial = 1
    for (i in 1..numero) {
        fatorial *= i
    }

    println("Número: $numero Fatorial = $fatorial")
}