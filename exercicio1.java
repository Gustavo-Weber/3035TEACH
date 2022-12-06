import java.util.Arrays;

public class exercicio1 {  
	
	public int numeros[] = { 1, 2, 3, 4, 5, 6, 6 }; 

    
    public int segundoMaior(int[] array)
    {
        Arrays.sort(array);
     
        int maior = array.length - 1;
        
        int segundoMaior = maior;
        
        for(int i = array.length - 1; i >= 0; i--)
        {
        	if(array[i] != maior)
        	{
        		segundoMaior = array[i];
        		break;
        	}
        }
        
        return segundoMaior;
        
    }




}
