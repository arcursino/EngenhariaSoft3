package system;
import java.text.SimpleDateFormat;

import external.Transacao;

public class TransacaoInfoUS extends TransacaoInfo {

	public TransacaoInfoUS(Transacao transacao) {
		super(transacao);
	}

	@Override
	public String dataPorRegiao() {
		SimpleDateFormat mascara = new SimpleDateFormat("MM/dd/yyyy");
		return mascara.format(transacao.getData());
	}
}
