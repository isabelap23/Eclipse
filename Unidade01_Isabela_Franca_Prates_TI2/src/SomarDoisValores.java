import java.util.Scanner;
class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		//Declaração de variaveis
		int num1, num2, soma;
		//leituras
		System.out.println("Digite um número");
		num1 = sc.nextInt();
		System.out.println("Digite outro número");
		num2 = sc.nextInt();
		
		//somar
		soma = num1 + num2;
		
		//mostrar
		System.out.println("Soma: " + soma);
		
	}

}