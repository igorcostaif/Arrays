
public class Servico {
	int[] newVetor = new int[5];
	
	public int[] verifica(int[]v1, int[]v2) {
		int total=0;
		for(int cont=0;cont<v1.length;cont++) {
			for(int cont1=0;cont1<v2.length;cont1++) {
				if(v1[cont]==v2[cont1]) {
					newVetor[total]=v2[cont1];
					total++;
				}
			}
		}
		
		return newVetor;
		
	}

}
