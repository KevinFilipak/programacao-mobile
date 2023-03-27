fun main() {
    print("Digite a 1ª nota: ")
    val nt1 = readLine()!!.toDouble()

    print("Digite a 2ª nota: ")
    val nt2 = readLine()!!.toDouble()

    print("Digite a 3ª nota: ")
    val nt3 = readLine()!!.toDouble()

    val media = (nt1 * 2 + nt2 * 3 + nt3 * 5) / 10

    if (media >= 7) {
        print("Aluno aprovado! ")
    } else if (media < 5) {
        print("Aluno reprovado! ")
    } else {
        print("Aluno em final! ")
    }

    print("Com média de $media")
}