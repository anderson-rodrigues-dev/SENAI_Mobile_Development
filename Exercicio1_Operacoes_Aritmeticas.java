import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    try{
	        Scanner scan = new Scanner(System.in);
		
    		System.out.print("Digite seu nome: ");
    		String nome = scan.next();
    		
    		System.out.print("Digite um número: ");
    		int a = scan.nextInt();
    		
    		System.out.print("Digite outro número: ");
    		int b = scan.nextInt();
    		
    		System.out.print("Digite a operação que deseja realizar: ");
    		String op = scan.next();
    		
    		int total = 0;
    		
    		switch(op){
    		    case "+": total = a + b; break;
                case "-": total = a - b; break;
                case "*": total = a * b; break;
                case "/": total = a / b; break;
    		}
    		
    		System.out.println("Resultado da operação: " + total);
	    } catch(Exception e){
	        System.err.println("Você digitou uma opção inválida");
	        
	    }
		
	}
}
