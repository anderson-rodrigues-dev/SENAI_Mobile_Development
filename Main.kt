/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner
fun main() {
    try{
        print("Informe seu nome: ")
        val nome = Scanner(System.`in`)
        println("Olá $nome!!")
        
        print("Insira um número: ")
        val n1 = Scanner(System.`in`)
        val a = n1.nextInt()
        
        print("Insira outro número: ")
        val n2 = Scanner(System.`in`)
        val b = n2.nextInt()
        
        print("Insira a operação: ")
        val op = Scanner(System.`in`)
        val operacao = op.next()
        
        var total = 0
        
        when(operacao){
            "+" -> total = a + b
            "-" -> total = a - b
            "*" -> total = a * b
            "/" -> total = a / b
        }
        print("Resultado da Operação: $total")
    } catch(Exc){
        
    }
    
}

