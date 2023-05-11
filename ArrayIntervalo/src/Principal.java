import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = new int[5];
		Scanner in = new Scanner(System.in);
		Servico s = new Servico();
		
		for(int cont=0;cont<vetor.length;cont++) {
			
			vetor[cont] = in.nextInt();
			
		}
		
		System.out.println("Digite o mínimo: ");
		int min = in.nextInt();
		System.out.println("Digite o máximo: ");
		int max = in.nextInt();
		
		int[] v = s.encontraIntervalo(vetor, min, max);
		
		System.out.println(Arrays.toString(v));
		
		System.out.println(Arrays.toString(s.encontraIntervalo(vetor, in.nextInt(), in.nextInt())));

	}

}
