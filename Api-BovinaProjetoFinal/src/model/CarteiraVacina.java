package model;


public abstract class CarteiraVacina {
	private Vacina raiva;
	private Vacina carbunculo;
	private Vacina brucelose;
	private Vacina aftosa;
	private Vacina pneumonia;
	private Vacina glasser;
	private Vacina rotavirus;
	private Vacina rinite;
	public Vacina getRaiva() {
		return raiva;
	}
	public void setRaiva(Vacina raiva) {
		this.raiva = raiva;
	}
	public Vacina getCarbunculo() {
		return carbunculo;
	}
	public void setCarbunculo(Vacina carbunculo) {
		this.carbunculo = carbunculo;
	}
	public Vacina getBrucelose() {
		return brucelose;
	}
	public void setBrucelose(Vacina brucelose) {
		this.brucelose = brucelose;
	}
	public Vacina getAftosa() {
		return aftosa;
	}
	public void setAftosa(Vacina aftosa) {
		this.aftosa = aftosa;
	}
	public Vacina getPneumonia() {
		return pneumonia;
	}
	public void setPneumonia(Vacina pneumonia) {
		this.pneumonia = pneumonia;
	}
	public Vacina getGlasser() {
		return glasser;
	}
	public void setGlasser(Vacina glasser) {
		this.glasser = glasser;
	}
	public Vacina getRotavirus() {
		return rotavirus;
	}
	public void setRotavirus(Vacina rotavirus) {
		this.rotavirus = rotavirus;
	}
	public Vacina getRinite() {
		return rinite;
	}
	public void setRinite(Vacina rinite) {
		this.rinite = rinite;
	}
	
	
}

