
public class Servico {
	
	int[] newVetor = new int[5];
	
	public int[] encontraIntervalo(int[] n,int min, int max) {
		int total = 0;
		for(int cont = 0; cont<n.length;cont++) {
			
			if((n[cont]>=min) && (n[cont]<=max) ) {
				newVetor[total] = n[cont];
				total++;
			}
			
		}
		
		return newVetor;
		
	}

}
