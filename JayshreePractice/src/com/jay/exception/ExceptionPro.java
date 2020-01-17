/**
 * 
 */
package com.jay.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InterruptedIOException;

/**
 * @author spatil28
 *
 */
public class ExceptionPro {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) {
		File f=new File("C:\\Users\\spatil2\\Documents\\.docx");
		System.out.println("file pro");
		ExceptionPro e= new ExceptionPro();
		e.method1(f);

		
		
		
	}
public final void method1(File f)  {
	try {
		FileWriter fw=new FileWriter(f);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//FileWriter fw=new FileWriter(f);
	finally {
		System.out.println("Finally called");
	}

	
	
}
}
