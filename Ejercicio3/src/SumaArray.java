
public class SumaArray {

	private int array[];
	
	/**
	 * Metodo que comprueba si el array es nulo, esta vacio y suma los numeros que acaben en 1
	 * @param array
	 * @return
	 */
	public int metodo(int[] array) {
		
		int resultado=0;
		if(array.length==0) {
			System.out.println("Array vacio");
		}else if(array==null) {
			System.out.println("Array nulo");
		}else {
			int suma=0;
			for (int i = 0; i < array.length; i++) {
				
				int resto=(array[i]-1)%10;
				
				if(resto==0) {
					suma+=array[i];
				}
			}
		}
		
		return resultado;
	}
	
}
