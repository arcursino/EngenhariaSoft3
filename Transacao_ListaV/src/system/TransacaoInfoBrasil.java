package system;
import java.text.SimpleDateFormat;

import external.Transacao;

public class TransacaoInfoBrasil extends TransacaoInfo {

	public TransacaoInfoBrasil(Transacao transacao) {
		super(transacao);
	}

	@Override
	public String dataPorRegiao() {
		SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yyyy");
		return mascara.format(transacao.getData());
	}
}

