package es.cic.curso11.snippets.archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

import java.io.IOException;

public class ArchivoOperacionNIO {

	public void copiarArchivoNIO(String rutaArchivoOrigen, String rutaArchivoFinal) throws IOException {
		
		Path pathArchivoOrigen = Paths.get("rutaArchivoOrigen");
		Path pathArchivoFinal = Paths.get("rutaArchivoFinal");
		
		Files.copy(pathArchivoOrigen, pathArchivoFinal, COPY_ATTRIBUTES, REPLACE_EXISTING);
		
	}
	
}
