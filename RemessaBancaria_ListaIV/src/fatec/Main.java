package fatec;
import java.io.File;
import java.io.FileNotFoundException;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import java.io.FileNotFoundException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {

	public static void main(String[] args) throws IOException {
		Leitor leitor = new RemessaXml();
		System.out.println(leitor.escreverArquivo());
		
		
		

	}
	
		/*
		 * Chamar json da Classe RemessaJson
		RemessaJson[] remessaJson = new Gson().fromJson(json, RemessaJson.class);
			
	*/
}
