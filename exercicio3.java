
public class exercicio3 {

	public String vogais(String string)
	{
		String vogais = "";
		
		for(int i  = 0; i < string.length(); i++)
		{
			String digito = string.substring(i, i + 1);
			
			if(digito.matches("[aeiouAEIOU]") || digito.isBlank()) vogais += digito;
			
		}
		
		
		return vogais;		
	}
	
}
