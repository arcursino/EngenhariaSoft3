package system;

import java.util.Date;

import external.Transacao;

public class TransacaoInfoTempo {
	private Date data;
	private Transacao transacao;
	
	public TransacaoInfoTempo(Transacao transacao) {
		super();
		this.transacao = transacao;
		this.data = new Date();
	}
	

	//((x/3600000)/24)/365
	public String getDiff() {
		long diff = data.getTime() - transacao.getData().getTime();
		
		if(((diff/3600000)/24)/365 >= 1) {
			Long x = ((diff/3600000)/24)/365;
			return x.toString().concat(" ano(s)");
		}
		if(((diff/3600000)/24)/30 >= 1) {
			Long x = ((diff/3600000)/24)/30;
			return x.toString().concat(" mes(es)");
		}
		if(((diff/3600000)/24) >= 1) {
			Long x = ((diff/3600000)/24);
			return x.toString().concat(" dia(s)");
		}
		if((diff/3600000) >= 1) {
			Long x = (diff/3600000);
			return x.toString().concat(" hora(s)");
		}
		if(diff/60000 >= 1) {
			Long x = (diff/60000);
			return x.toString().concat(" minuto(s)");
		}
		if(diff/1000 >= 1) {
			Long x = (diff/1000);
			return x.toString().concat(" segundo(s)");
		}
		else {
			return "agora";
		}
		
	}
	
	
	

}
