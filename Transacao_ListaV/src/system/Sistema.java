package system;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import external.Conta;
import external.Transacao;

public class Sistema {
	public static void main(String[] args) throws ParseException {
		Conta c = new Conta(new Date(), "Bank of America", "123-45");
		DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		Date date = (Date)formatter.parse("05/29/20");
		Date data = new Date();
		Transacao t = new Transacao(data, c, 1000);
		// antes, adaptar para o padrão brasileiro
		TransacaoInfo tif = new TransacaoInfoUS(t);
		System.out.println(tif.dataPorRegiao());
		// data sem adaptação
		System.out.println(tif.transacao.getData().toString());
			
		
		System.out.println(tif.getDiff());
		
	    
	    
	}
}