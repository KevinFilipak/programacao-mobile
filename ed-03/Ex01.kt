class ContaBancaria(val conta_s_cliente: String
                    , var conta_f_saldo: Double
                    , val conta_s_numero: String
                    , val conta_s_agencia: String)
{
    fun depositar(valor: Double) {
        conta_f_saldo += valor
    }

    fun retirar(valor: Double) {
        if (conta_f_saldo >= valor) {
            conta_f_saldo -= valor
        }
    }

    fun transferir(contaDestino: ContaBancaria, valor: Double) {
        if (conta_f_saldo >= valor) {
            conta_f_saldo -= valor
            contaDestino.depositar(valor)
        }
    }

    fun imprimirExtrato() {
        println("----------------------------")
        println("Cliente: $conta_s_cliente")
        println("Agência: $conta_s_agencia")
        println("Número: $conta_s_numero")
        println("Saldo: R$ $conta_f_saldo")
        println("----------------------------")

    }
}

fun main() {
    val _contabancaria1 = ContaBancaria("Kevin Filipak"
            , 472.0
            , "123456"
            , "1122")

    _contabancaria1.depositar(150.5)

    _contabancaria1.retirar(50.5)

    _contabancaria1.imprimirExtrato()
}
