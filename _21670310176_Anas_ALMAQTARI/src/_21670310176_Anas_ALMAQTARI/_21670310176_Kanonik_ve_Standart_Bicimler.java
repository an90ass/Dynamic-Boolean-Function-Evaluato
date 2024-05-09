package _21670310176_Anas_ALMAQTARI;
import java.util.*;
public class _21670310176_Kanonik_ve_Standart_Bicimler {
	 private static Set<Integer> mintrim = new LinkedHashSet<>();
	 private static Set<Integer> maxtrim = new LinkedHashSet<>();
	 
	    public static Set<Integer> getMintrim() {
	        return mintrim;
	    }

	    public static Set<Integer> getMaxtrim() {
	        return maxtrim;
	    }

	    public static void addMintrim(int value) {
	        mintrim.add(value);
	    }

	    public static void addMaxtrim(int value) {
	        maxtrim.add(value);
	    }
	    public static int[] getFonksiyonunCiktileri() {
	        return _21670310176_dogrulukTablosu.getFonksiyonunCiktileri();
	    }

	    public static int[][] get_4_degiskenli_DogrulukTablosu() {
	        return _21670310176_dogrulukTablosu._4_degiskenli_DogrulukTablosu();
	    }
	    
	    public static char[] getDegiskenler() {
	        return _21670310176_dogrulukTablosu.degiskenler;
	    }

	    public static int getDegiskenSayi() {
	        return _21670310176_dogrulukTablosu.degiskenler.length;
	    }
	    static void CarimlarinToplami() {

	        System.out.print("F = ");

	        boolean Ilkminter = true;

	        for (int i = 0; i < getFonksiyonunCiktileri().length; i++) {
	            if (getFonksiyonunCiktileri()[i] == 1) {
	                if (!Ilkminter) {
	                    System.out.print(" + ");
	                } else {
	                	Ilkminter = false;
	                }
	                addMintrim(i);
	                for (int j = 0; j < getDegiskenSayi(); j++) {
	                    if (get_4_degiskenli_DogrulukTablosu()[j][i] == 0) {
	                        System.out.print(getDegiskenler()[j] + "'" + "");
	                    } else {
	                        System.out.print(getDegiskenler()[j] + "");
	                    }
	                }
	            }
	        }
	    }

	 static void minterimlerinToplami() {
	        char carpimSembolu = '\u03A3';
	        System.out.println();
	        System.out.print("F = " + carpimSembolu + "(");
	        if (!getMintrim().isEmpty()) {
	            boolean first = true;
	            for (Integer value : mintrim) {
	                if (!first) {
	                    System.out.print(",");
	                }
	                System.out.print(value);
	                first = false;
	            }
	        }
	        System.out.println(")");
	    }
	 static void ToplamlarinCarpimi() {
	        System.out.print("F = ");
	        boolean ilkTerim = true; 
	      for (int i = 0; i < getFonksiyonunCiktileri().length; i++) {
	            if (getFonksiyonunCiktileri()[i] == 0) {
	                if (!ilkTerim) {
	                    System.out.print(".("); 
	                } else {
	                    System.out.print("(");
	                    ilkTerim = false; 
	                }	                
	                boolean ilkLiterel = true;
	                for (int j = 0; j < getDegiskenSayi(); j++) {
	                    if (!ilkLiterel) {
	                        System.out.print("+"); 
	                        } else {
	                    	ilkLiterel = false; 
	                    }
	                    if (get_4_degiskenli_DogrulukTablosu()[j][i] == 0) {
	                        System.out.print(getDegiskenler()[j]);  
	                    } else {
	                        System.out.print(getDegiskenler()[j] + "'"); 
	                    }
	                }
	                System.out.print(")");
	                addMaxtrim(i);
	            }
	        }
	    }

	     static void maxterimlerCarpimi() {
	        char toplamSembolu = '\u220F';
	        System.out.println();
	        System.out.print("F = " + toplamSembolu + "(");
	        if (!getMaxtrim().isEmpty()) {
	            boolean first = true;
	            for (Integer value : maxtrim) {
	                if (!first) {
	                    System.out.print(",");
	                }
	                System.out.print(value);
	                first = false;
	            }
	        }
	        System.out.println(")"); 
	    }
	   
		    	    
		    
		    
	}