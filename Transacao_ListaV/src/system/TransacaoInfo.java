package system;

import external.Transacao;

public abstract class TransacaoInfo {
	protected Transacao transacao;

	public TransacaoInfo(Transacao transacao) {
		this.transacao = transacao;
	}

	public abstract String dataPorRegiao();

	public Transacao getTransacao() {
		return transacao;
	}
	
	public String getDiff() {
		TransacaoInfoTempo x = new TransacaoInfoTempo(this.transacao);
		return x.getDiff();
	}
}