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
    }

    fun aplicarJuros() {
        val juros = conta_f_saldo * 0.003 // 0,3% de juros ao dia
        depositar(juros)
    }
    
     fun imprimirBoleto() {
 		println("-------- BOLETO --------")
        println("Cliente: $conta_s_cliente")
        println("Agência: $conta_s_agencia")
        println("Número: $conta_s_numero")
        println("Valor: R$ $conta_f_saldo")
        println("------------------------")
    }
}

fun main() {
    val _contabancaria1 = ContaBancaria("Kevin Filipak"
            , 472.0
            , "123456"
            , "1122")
    val _contabancaria2 = ContaBancaria("Alex Santos"
            , 765.0
            , "654321"
            , "1122")

    _contabancaria1.imprimirBoleto()
    _contabancaria2.imprimirBoleto()


}
