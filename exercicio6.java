import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		double numeros[] = new double[3];
		
		System.out.println("Insira "+ numeros.length +"n�meros");

		for(int i = 0; i < numeros.length; i++) 
		{
			System.out.println("Insira o "+ (i + 1) + "� n�mero");
			numeros[i] = scanner.nextDouble();
		}
		
		double media = 0;
		
		for(int i = 0; i < numeros.length; i++) media += numeros[i];
		
		media /= numeros.length;
		
		DecimalFormat format = new DecimalFormat("0.00");
		
		System.out.println("M�dia: " + format.format(media));
		
		
	}
	
	
	
	
}
