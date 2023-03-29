import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		Servico s = new Servico();
		
		int[] n = new int[10];
		
		for(int cont=0; cont<n.length; cont++) {
			
			n[cont] = in.nextInt();
			
			
		}
		
		System.out.println(s.somar(n));
		
		
		
	}

}

