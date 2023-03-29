
public class Servico {

	public int somar(int[] v) {
		int somar = 0;
		for (int cont = 0; cont < v.length; cont++) {
			somar += v[cont];
		}

		return somar;

	}

}
