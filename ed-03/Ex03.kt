class ContaBancaria(val conta_s_cliente: String
                    , var conta_f_saldo: Double
                    , val conta_s_numero: String
                    , val conta_s_agencia: String)
{
    fun imprimirExtrato() {
        println("----------------------------")
        println("Cliente: $conta_s_cliente")
        println("Agência: $conta_s_agencia")
        println("Número: $conta_s_numero")
        println("Saldo: R$ $conta_f_saldo")
    }
}

fun main() {
    
    val contasBancarias = listOf(
     ContaBancaria("Kevin Filipak", 472.0, "123456", "1122")
    ,ContaBancaria("Alex Santos", 765.0, "654321", "1122")
	,ContaBancaria("Cleverson Andrade", 751.5, "654321", "1122")
	,ContaBancaria("Ederson Guilherme", 1255.0, "654321", "1122")
	,ContaBancaria("Flavio Antonio", 465.20 , "654321", "1122"))
    
    val contasOrdenadoBySaldo = contasBancarias.sortedBy {it.conta_f_saldo}

        println("Contas em ordem crescente do menor para o maior saldo:")
        contasOrdenadoBySaldo.forEach { contas ->
            contas.imprimirExtrato();
        }

     val contasOrdenadoByNome = contasBancarias.sortedBy { it.conta_s_cliente }

        println("\nContas em ordem alfabética pelo nome do cliente:")
        contasOrdenadoByNome.forEach { contas ->
            contas.imprimirExtrato();
    }
}