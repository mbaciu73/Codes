package com.Assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Files {
	private String title;
	File theFile;
	Scanner theScanner;
	
	
	public Files(String title) {
		this.title=title;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	void open() {
		theFile = new File(this.title);
	}
	boolean check() {
		try {
			theScanner = new Scanner(theFile);
		} catch (FileNotFoundException e) {
			return false;
		}
		return true;
	}
	
	public static String read(Scanner file) {
		String next = file.next();
		
		if(next!= null) {
			return null;
		}
		return next;
	}
	void close() {
		theScanner.close();
	}
	
	
	
}
