package fundamentos

fun main(){
    parOuImpar(2)
}

fun parOuImpar(numero: Int) {
    if (numero % 2 == 0){
        println("par")
    }else{
        println("impar")
    }
}