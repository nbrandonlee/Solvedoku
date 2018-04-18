package application;


import java.io.File;
import java.io.IOException;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class test2 {
	public static void main (String[] args) throws IOException{
		// creating file instance and referencing the file in its location
		File imageFile = new File("C:\\Users\\ss115\\Desktop\\10.jpg");
		
		ITesseract instance = new Tesseract();
		instance.setDatapath("C:/eclipse_tess4j/Tess4J/tessdata");
		
		try {
			String result = instance.doOCR(imageFile);
			System.out.println(result);
		} catch(TesseractException e) {
			System.err.println(e.getMessage());
		}
		
	}
	

}