package fundamentos

fun main(){
    parOuImpar(2)
    resultadoNota(7)
    resultadoNota(6)
    resultadoNota(3)

}

fun parOuImpar(numero: Int) {
    if (numero % 2 == 0){
        println("par")
    }else{
        println("impar")
    }
}
/*
regra: aprovado > 7
       Recuperação > 5
       Reprovado <= 4
*/

fun resultadoNota(nota: Int){
    if (nota >= 7){
        println("Aprovado")
    }else if (nota >= 6){
        println("Recuperação")
    }else{
        println("reprovado")
    }
}