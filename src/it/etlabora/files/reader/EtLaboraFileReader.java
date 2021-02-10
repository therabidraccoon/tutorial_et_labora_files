package it.etlabora.files.reader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class EtLaboraFileReader {
	
	public void readFile() {
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("C:\\Dev\\eclipse_workspaces\\et_labora\\FilesExamples\\index.html")));
			int data = bis.read();
			while(data != -1) {
				char lettera = (char) data;
				System.out.print(lettera);
				data = bis.read();
			}
			bis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void readFileBufferedReader() {
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Dev\\eclipse_workspaces\\et_labora\\FilesExamples\\index.html")));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
