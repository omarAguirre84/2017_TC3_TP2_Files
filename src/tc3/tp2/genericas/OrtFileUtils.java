package tc3.tp2.genericas;

import java.io.IOException;
import java.io.File;

public class OrtFileUtils {

	public static String getFullFileName(File f) throws IOException {
		String res;
		if (f.exists()) {
			res = f.getCanonicalPath();
		}else{
			throw new IOException();
		}
		return res;
	}

	public static String checkFolder(String pathname, boolean crear) throws RuntimeException, IOException {
		
		return "";
	}

}
