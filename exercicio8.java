import java.util.Scanner;

public class exercicio8 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		double numeros[] = new double[2];
		
		System.out.println("Insira "+ numeros.length +"números");

		for(int i = 0; i < numeros.length; i++) 
		{
			System.out.println("Insira o "+ (i + 1) + "º número");
			numeros[i] = scanner.nextDouble();
		}
		
		System.out.println("Qual operação gostaria de realizar? 1 - Soma, 2 - subtração, 3 - multiplicação, 4 - divisão");
		int escolha = scanner.nextInt();
		
		String operacao = "";
		double resultado = 0;
		
		switch(escolha)
		{	
			case 1:
				operacao = "soma";
				for(int i = 0; i < numeros.length; i++)resultado += numeros[i];
			break;
			
			case 2:
				operacao = "subtração";
				resultado = numeros[0];
				for(int i = 1; i < numeros.length; i++)resultado -= numeros[i];
			break;
			
			case 3:
				operacao = "multiplicação";
				resultado = numeros[0];
				for(int i = 1; i < numeros.length; i++)resultado *= numeros[i];
			break;
			
			case 4:
				operacao = "divisão";
				resultado = numeros[0];
				for(int i = 1; i < numeros.length; i++)resultado /= numeros[i];
			break;
		
			default:
				System.out.println("Entrada Inválida, encerrando operação");
			break;
		}		
		
		System.out.println("Resultado da " + operacao + ": " + resultado);
		
	}
	
	
}
