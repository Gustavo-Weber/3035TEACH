import java.util.Scanner;

public class exercicio8 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		double numeros[] = new double[2];
		
		System.out.println("Insira "+ numeros.length +"n�meros");

		for(int i = 0; i < numeros.length; i++) 
		{
			System.out.println("Insira o "+ (i + 1) + "� n�mero");
			numeros[i] = scanner.nextDouble();
		}
		
		System.out.println("Qual opera��o gostaria de realizar? 1 - Soma, 2 - subtra��o, 3 - multiplica��o, 4 - divis�o");
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
				operacao = "subtra��o";
				resultado = numeros[0];
				for(int i = 1; i < numeros.length; i++)resultado -= numeros[i];
			break;
			
			case 3:
				operacao = "multiplica��o";
				resultado = numeros[0];
				for(int i = 1; i < numeros.length; i++)resultado *= numeros[i];
			break;
			
			case 4:
				operacao = "divis�o";
				resultado = numeros[0];
				for(int i = 1; i < numeros.length; i++)resultado /= numeros[i];
			break;
		
			default:
				System.out.println("Entrada Inv�lida, encerrando opera��o");
			break;
		}		
		
		System.out.println("Resultado da " + operacao + ": " + resultado);
		
	}
	
	
}
