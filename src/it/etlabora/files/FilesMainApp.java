package it.etlabora.files;

import it.etlabora.files.reader.EtLaboraFileReader;
import it.etlabora.files.writer.EtLaboraFileWriter;

public class FilesMainApp {

	public static void main(String[] args) {
		
		byte min = Byte.MIN_VALUE;
		byte max = Byte.MAX_VALUE;
		System.out.println("Un byte può valere tra " + min + " e " + max);
		
		EtLaboraFileReader reader = new EtLaboraFileReader();
		reader.readFile();
//		reader.readFileBufferedReader();
		
		EtLaboraFileWriter writer = new EtLaboraFileWriter();
		writer.writeFile();
//		writer.writeFileBufferedWriter();
	}
	
}
