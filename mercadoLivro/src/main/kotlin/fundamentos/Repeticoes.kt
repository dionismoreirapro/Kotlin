package fundamentos

fun main(){
    exibe1A10()
    println("*********************************")
    exibe10A1()
    println("*********************************")
    exibePar()
    println("*********************************")
    exibeRange(20, 30)
}


fun exibe1A10(){
    for (numero in 1..10){
        println(numero)
    }
}

fun exibe10A1(){

    for (numero in 10 downTo 1){
        println(numero)
    }
}

fun exibePar(){
    for (numero in  2 .. 10 step 2)
        println(numero)
}

fun exibeRange(num1: Int, num2: Int){
    for (numero in num1..num2 step 2)
        println(numero)
}