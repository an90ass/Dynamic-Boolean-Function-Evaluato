package _21670310176_Anas_ALMAQTARI;

import java.io.*;
import java.util.*;


public class _21670310176_dosyaOkuma {
	static String boolefunction="";
	 static void dosyaAcmaVeOkuma( String fileName) {

		StringBuilder contentBuilder = new StringBuilder();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                contentBuilder.append(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        boolefunction= contentBuilder.toString();
    }

	 }
	
	    
	 