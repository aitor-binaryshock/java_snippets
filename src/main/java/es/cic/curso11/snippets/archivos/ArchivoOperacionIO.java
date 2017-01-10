package es.cic.curso11.snippets.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class ArchivoOperacionIO {

public void copiarArchivo(File fileIn, File fileOut) throws FileNotFoundException, IOException {
	    
	    try (   InputStream streamLectura = new FileInputStream(fileIn);
	    		OutputStream streamEscritura = new FileOutputStream(fileOut)  ) {
	        byte[] buffer = new byte[4096];
	        int length;
	        while ((length = streamLectura.read(buffer)) > 0) {
	        	streamEscritura.write(buffer, 0, length);
	        }
	    }
	    
	}
	
	public void leerPorLineasArchivo(File fileListIn) throws FileNotFoundException, IOException {
		
		try (   BufferedReader bufferLectura = new BufferedReader(new FileReader(fileListIn)) ) {
			
			String line;
			ArrayList<String> listaPalabras = new ArrayList<String>();
			
			while ( ((line = bufferLectura.readLine()) != null) ) {
				
				if (line.length() != 0) {
					//listaPalabras.add(line);
					String printedString = line + ";" + line.length();
					listaPalabras.add(printedString);
				}
			}
			
			System.out.println(listaPalabras);
			System.out.println(listaPalabras.size());
			
	    }
		
	}
	
}
