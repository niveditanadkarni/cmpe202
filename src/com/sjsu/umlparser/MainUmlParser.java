package com.sjsu.umlparser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;


public class MainUmlParser {

	private static File files= null;
	private static File[] listoffiles= null;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String file = "Users/niveditanadkarni/cmpe202-master/umlparser/uml-parser-test-1/A.java";
		
		System.out.println(file);
		File f = new File(file);
		if(f.exists() && !f.isDirectory()) { 
		    // do something
		}
		//if (!file.isDirectory())
		//{
		//	 file = file.getParentFile();
		//}

	}

}
