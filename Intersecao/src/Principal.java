import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]v1 = {1,3,5,7,9};
		int[]v2 = {0,10,5,3,11};
		
		Servico s = new Servico();
		
		System.out.println(Arrays.toString(s.verifica(v1, v2)));

	}

}
