package com.helper;

import java.io.IOException;

import com.properties.Confiuration_Reader;

public class File_Reader_manager {
	private File_Reader_manager() {

	}
	public static File_Reader_manager getInstance() {
		File_Reader_manager helper= new File_Reader_manager();
		return helper;
	}
	public Confiuration_Reader getInstanceCR() throws IOException {
		Confiuration_Reader reader=new Confiuration_Reader();
		return reader;
	}

}
