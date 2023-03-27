fun main(){

    println("Digite o primeiro número: ")
    val num1 = readln().toDouble()

    println("Digite o primeiro número: ")
    val num2 = readln().toDouble()

    println("Digite o primeiro número: ")
    val num3 = readln().toDouble()

    val numeros = mutableListOf(num1, num2, num3)
    numeros.sort()

    println("Os números em ordem crescente são: $numeros")

}