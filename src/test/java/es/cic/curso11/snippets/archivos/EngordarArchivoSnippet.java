package es.cic.curso11.snippets.archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EngordarArchivoSnippet {

	/**
	 * Writes data in a File until it reaches aprox. 400 Mb
	 * @param pathArchivo
	 * @throws IOException 
	 */
	@SuppressWarnings("unused")
	private void engordarArchivo(Path pathArchivo) throws IOException {
		
		String cadenaLarga = "";
		for (int i=0; i < 200; i++) {
			cadenaLarga += "0";
		}
		
		List<String> tochacoPreparado = new ArrayList<String>();
		for (int i=0; i < 2000000; i++) {
			tochacoPreparado.add(cadenaLarga);
		}
		
		Files.write(pathArchivo, tochacoPreparado);
		
	}
	
}
