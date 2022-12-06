public class exercicio2 {

	public int[] inverteString(int[] array)
    {
		int[] arrayInvertido = new int[array.length];
		
        
        for(int i = 0; i < array.length; i++)
        {
        	arrayInvertido[i] = array[array.length - i - 1];
        }
        
        return arrayInvertido;
        
    }
	
	
}
