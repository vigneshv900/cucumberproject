package practicefiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Samples {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("input.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		StringBuffer sb = new StringBuffer();
		String line;
		while((line=br.readLine())!=null) {
			sb.append(line);
			sb.append("\n");
		}
		fr.close();
		
		System.out.println(sb.toString());
		
		
 	}
	
	public void textFile() {
		try {
			File f = new File("input.txt");
			if(!f.exists()) {
				f.createNewFile();
		FileWriter fw = new FileWriter(f);
		fw.write("This is a text file\n"+"This is also a test file");
		fw.close();
			}
			}
			
			catch(Exception e) {
				e.printStackTrace();
			}
	}
}
