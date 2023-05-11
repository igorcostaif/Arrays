
public class Servico {
	
	
	public String verificaResultado(int[]jogadas) {
		
		if(((jogadas[0]==jogadas[1])&&(jogadas[0]==jogadas[2]))) {
			return "Jogo empatado";
		}else if((jogadas[0]!=jogadas[1])&&(jogadas[0]!=jogadas[2])) {
			return "O jogador A ganhou!!!!";
		}else if((jogadas[1]!=jogadas[0])&&(jogadas[1]!=jogadas[2])) {
			return "O jogador B ganhou!!!!";
		}else {
			return "O jogador C ganhou!!!!";
		}
			
		
	}
	
	

}
