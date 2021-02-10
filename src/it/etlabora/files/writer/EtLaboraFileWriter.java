package it.etlabora.files.writer;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class EtLaboraFileWriter {

	public void writeFile() {

		try {
			BufferedOutputStream bout = new BufferedOutputStream(
					new FileOutputStream(new File("C:\\Dev\\eclipse_workspaces\\et_labora\\FilesExamples\\nuovo.txt")));
			String contenuto = "è presto";
			byte[] contentArray = contenuto.getBytes();
			bout.write(contentArray);
			bout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void writeFileBufferedWriter() {

		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter(new File("C:\\Dev\\eclipse_workspaces\\et_labora\\FilesExamples\\nuovo.txt")));
			String contenuto = "Sto facendo lezione col buffered writer";
			writer.write(contenuto);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
