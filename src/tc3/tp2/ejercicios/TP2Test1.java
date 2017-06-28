package tc3.tp2.ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import tc3.tp2.genericas.OrtFileUtils;

public class TP2Test1 {

	public static void main(String[] args) {
		try {
			File f = createFile("numeros.dat", createDirectory("data"));
			write500IntoFile(f);
			readTheFile(f);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void write500IntoFile(File f) {
		if (!f.canWrite()) {
			f.setWritable(true);
		}
		try {
			FileWriter fw = new FileWriter(f);
			for (int i = 1; i < 501; i++) {
				fw.write(i);
			}
			fw.flush();
			fw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void readTheFile(File f) {
		if (!f.canRead()) {
			f.setReadable(true);
		}
		try {
			FileReader fr = new FileReader(f);
			boolean ok = true;
			do{
				int a = fr.read();
				if (a == -1) {
					ok = false;
					fr.close();
				}else{
					System.out.println(a);
				}
			}while (ok);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static File createFile(String nombre, File folder) {
		File x2 = new File(folder, nombre);
		try {
			if (OrtFileUtils.existe(folder)) {
				x2.delete();
				x2.createNewFile();
			} else {
				OrtFileUtils.checkFolder(folder.getName(), true);
				x2.createNewFile();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return x2;
	}

	public static File createDirectory(String nombre) throws Exception {
		File folder = new File(nombre);
		try {
			folder.mkdirs();
		} catch (Exception e) {
			throw new Exception("error");
		}
		return folder;
	}
}
