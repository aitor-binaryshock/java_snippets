package es.cic.curso11.snippets.archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CrearArchivoTemporalSnippet {

	/**
	 * Creates a File in the temporary folder
	 * @param prefijo
	 * @param sufijo
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("unused")
	private Path crearArchivoTemporal(String prefijo, String sufijo) throws IOException {
		
		return Files.createTempFile(prefijo, sufijo);
		
	}
	
}
