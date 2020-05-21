package fatec;

import java.io.File;
import java.io.FileNotFoundException;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public abstract class Leitor {
	protected String cabecalho() {
		String cabecalho = "### Arquivo de envio de remessa ### \r\n";
		return cabecalho;
	}

	protected String rodape() {
		String rodape = "### Fim arquivo ###";
		return rodape;
	}

	// M�todo gancho
	protected abstract String construirArquivo() throws IOException;

	public String escreverArquivo() throws IOException {
		return cabecalho() + construirArquivo() + rodape();
	}
}

