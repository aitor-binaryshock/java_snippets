package es.cic.curso11.snippets.archivos;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import java.io.File;

public class ArchivoOperacionNIOTest {

	// Origenes de Datos
	//String archivoPruebaEnBlanco = "D:" + File.separator + "USUARIOS" + File.separator + "aitor" + File.separator + "testing" + File.separator + "archivos" + File.separator + "archivoVacio.txt";
	String archivoPruebaEnBlanco = "C:\\testing\\archivos\\archivoVacio.txt";
	String archivoPruebaCeros = "C:\\testing\\archivos\\archivoCeros.txt";
	
	// Ubicación de los archivos finales
	String destinoPruebaEnBlanco = "D:\\USUARIOS\\aitor\\testing\\resultados\\archivoVacioCopia.txt";
	String destinoPruebaCeros = "D:\\USUARIOS\\aitor\\testing\\resultados\\archivoCerosCopia.txt";
	
	// Definicion de la Clase de Pruebas
	ArchivoOperacionNIO cut;
	
	@Before
	public void setUp() throws Exception {
		cut = new ArchivoOperacionNIO();
	}

	@Test
	public void copiarArchivoVacioTest() throws IOException {
		cut.copiarArchivoNIO(archivoPruebaEnBlanco, destinoPruebaEnBlanco);
	}

	@Test
	public void copiarArchivoCerosTest() throws IOException {
		cut.copiarArchivoNIO(archivoPruebaCeros, destinoPruebaCeros);
	}
	
}
