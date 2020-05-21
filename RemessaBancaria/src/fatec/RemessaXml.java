package fatec;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class RemessaXml extends Leitor{
	@Override
	protected String construirArquivo() throws IOException {
		String xml = String.join("\n", Files.readAllLines(Paths.get("complemento IV/remessa.xml"), StandardCharsets.UTF_8));
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("br.com.pageseguro.RemessaCartaoCredito", Pagamento_credito.class);
		xstream.alias("br.com.pageseguro.RemessaCartaoDebito", Pagamento_debito.class);
		xstream.alias("br.com.pageseguro.RemessaBoleto", Pagamento_boleto.class);
		ArrayList<Registro> registros = (ArrayList<Registro>) xstream.fromXML(xml);
		Registros r = new Registros();
		Registro[] arrayRegistros = registros.toArray(new Registro[0]);
		r.setListaRegistros(arrayRegistros);
		return r.registrosToText();
	}
}
