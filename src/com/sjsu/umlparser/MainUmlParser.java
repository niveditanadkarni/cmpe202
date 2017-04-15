package com.sjsu.umlparser;

import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;


public class MainUmlParser {

	//private static File files= null;
	//private static File[] listoffiles= null;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String file = "Users/niveditanadkarni/cmpe202-master/umlparser/uml-parser-test-1/A.java";
		
		System.out.println(file);
		File f = new File(file);
		if(f.exists() && !f.isDirectory()) { 
		    // do something
		}
		File input_directory = new File(args[0]);
		File[] input_javafiles = input_directory.listFiles();
		if (input_javafiles != null) {

			/* array of class names */

			for (File classname : input_javafiles) {

				ArrayList<String> tokenisation = new ArrayList<String>();
				if ((classname.getName().contains(".java"))) {

					//File file = new File(classname.getPath());

					FileInputStream in = new FileInputStream(file);
					CompilationUnit cu;
					try {

						cu = JavaParser.parse(in, "UTF8");
					}

					finally {
						in.close();
					}
		//if (!file.isDirectory())
		//{
		//	 file = file.getParentFile();
		//}
				
	}
			}
		}
	
