import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio7 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um número real: ");
		double num = scanner.nextDouble();
		
		
		
		double por5 = (num / 100) * 5;
		double por50 = (num / 100) * 50;
		double por150 = (num / 100) * 150;
		
		DecimalFormat format = new DecimalFormat("0.0");
		System.out.println("5% = " + format.format(por5));
		
		format.applyPattern("0.00");
		System.out.println("50% = " + format.format(por50));
		
		format.applyPattern("0.000");
		System.out.println("150% = " + format.format(por150));
		
		
		
	}
	
	

	
}
