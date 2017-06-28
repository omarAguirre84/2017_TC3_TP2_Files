package tc3.tp2.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import tc3.tp2.genericas.OrtFileUtils;;

public class TP2Test2 {

	public static void main(String[] args) {
		try {
			File f = new File(OrtFileUtils.buscarArchivo("data"));
			FileWriter fw = new FileWriter(f.getAbsolutePath(), true);
			fw.write(1024);
			fw.close();
			
			mostrarArchivoEnteros("numeros");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void mostrarArchivoEnteros(String fullFilename) throws IOException, FileNotFoundException{
		String a = OrtFileUtils.buscarArchivo(fullFilename);
		File f = new File(a);
		TP2Test1.readTheFile(f);
	}
	
}
