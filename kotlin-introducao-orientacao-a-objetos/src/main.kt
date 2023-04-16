fun main() {
    println("Bem vindo ao Bytebank")
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

//    for (i in 5 downTo 1) {
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("número da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }

//    testaCondicoes(saldo)

    val conta1 = Conta("Dionis Moreira",3399)
    conta1.setSaldo(10000.00)

    println(conta1.titular)
    println(conta1.numero)
    println(conta1.getSaldo())


    conta1.Depositar(5000.00)
    println("Saldo atual ${conta1.getSaldo()}")

    conta1.Sacar(1000.00)
    println("Seu saldo é de : ${conta1.getSaldo()} ")

}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }

}

class Conta(
    var titular: String,
    var numero: Int
) {
    private var saldo = 0.0


    fun Sacar(valor: Double) {
        if (this.saldo < valor)
            println("Saldo Insuficiente!")
        else {
            this.saldo -= valor
            println("Saque realizado com sucesso")
        }
    }

    fun Depositar(valor: Double) {
        this.saldo += valor
        println("O valor de $valor foi depositado")
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        this.saldo = valor
    }
}





