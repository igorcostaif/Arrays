import java.util.Arrays;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] zerinho = new int[3];
		
		Servico s = new Servico();
		
		for(int cont=0;cont<zerinho.length;cont++) {
			
			zerinho[cont] = r.nextInt(2);
			
		}
		
		System.out.println(Arrays.toString(zerinho));
		
		System.out.println(s.verificaResultado(zerinho));
		
		
		
	}
}
