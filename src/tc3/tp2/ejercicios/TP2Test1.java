package tc3.tp2.ejercicios;

import java.io.File;

import tc3.tp2.genericas.OrtFileUtils;

public class TP2Test1 {
	static File f = new File("a.txt");
	static File fa;
	
	public static void main(String[] args) {
		try {
			System.out.println(OrtFileUtils.getFullFileName(f));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
