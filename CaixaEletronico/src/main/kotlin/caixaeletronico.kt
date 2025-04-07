package org.example

class caixaeletronico {

    var dinheiro = 0

    fun depositar() {
        var deposito = 0
        println("Digite o valor do deposito")
        deposito = readLine()!!.toInt()

        if (deposito <= 0 ) {
            println("Valor invalido")
        }
        dinheiro += deposito
        println("Deposito realizado")
        menu()
    }
    fun sacar() {
        var quantia: Int = 0
        do {
        println("Quanto você deseja sacar?")
            quantia = readLine()!!.toInt()
            if (quantia>dinheiro) {println("Valor Invalido!")}
        } while (quantia > dinheiro)
        dinheiro -= quantia
        println("Saque realizado com sucesso!")
        menu()
    }

    fun consultar() {
        println("O saldo atual é: $dinheiro")
        menu()
    }

    fun menu(){
        do {
            var opcao = 0
            println("---------------------")
            println("Caixa eletronico")
            println("---------------------")
            println("1 - Deposito")
            println("2 - Saque")
            println("3 - Consultar Saldo")
            println("4 - Sair")
            println("---------------------")
            println("Digite a opção desejada.")
            opcao = readLine()!!.toInt()
            when (opcao) {
                1 -> depositar()
                2 -> sacar()
                3 -> consultar()
                4 -> break
            }
            if (opcao > 4){
                println("Opção invalida, digite novamente!")
            }
        } while (opcao > 3)
    }
}
