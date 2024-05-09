package _21670310176_Anas_ALMAQTARI;
import java.util.*;
public class _21670310176_dogrulukTablosu {
   static char[] degiskenler = getUniqueKarakterler(_21670310176_dosyaOkuma.boolefunction); 
   private static int[] fonksiyonunCiktileri = new int[(int) Math.pow(degiskenler.length, 2)];
 public static void varsayilanCiktiler() {
     fonksiyonunCiktileri = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};// = 16 
 }
 public static int[] getFonksiyonunCiktileri() {
     return fonksiyonunCiktileri;
 }

 public static void setFonksiyonunCiktileri(int index, int value) {
	    fonksiyonunCiktileri[index] = value;
 }
	 static int[][] _4_degiskenli_DogrulukTablosu() {
	    return new int[][] {
	        {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
	        {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1},
	        {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1},
	        {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
	    };
	}
	 
	 static char[] getUniqueKarakterler(String function) {
		 TreeSet<Character> uniqueIkiliDegiskenler = new TreeSet<>();
		 char[] yasakKarakterler = {'+', '\'', ' ', '=', 'F', '*'};
		 for (char degisken : function.toCharArray()) {
		     if (indexOf(yasakKarakterler, degisken) == -1) {
		         uniqueIkiliDegiskenler.add(degisken);
		     }
		 }

        if (uniqueIkiliDegiskenler.size() > 4) {
            System.out.println("Değiskenlerin sayısı 4'ten fazla - Baska 4 degiskenli fonksiyon ile deneyin..");
        }
        if (uniqueIkiliDegiskenler.size() < 4) {
            System.out.println("Değiskenlerin sayısı 4'ten az - Baska 4 degiskenli fonksiyon ile deneyin..");
        }

        return convertTreeSetToCharArray(uniqueIkiliDegiskenler);
    }

    private static char[] convertTreeSetToCharArray(TreeSet<Character> sortedTreeSet) {
        char[] result = new char[sortedTreeSet.size()];
        int index = 0;
        for (char ch : sortedTreeSet) {
            result[index++] = ch;
        }
        return result;
    }
    
    static int indexOf(char[] array, char value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    
    public static void TabloYazdirma() {
		 _21670310176_Fonksioyn_Analizi.teriminVeCiktileri();  
		 _21670310176_Fonksioyn_Analizi.herkombiasyonIcinKarsilikMinterimDegeri(_21670310176_Fonksioyn_Analizi.ciktilar);

		    for (int i = 0; i < _4_degiskenli_DogrulukTablosu().length; i++) {
		        System.out.print(degiskenler[i] + " ");
		    }
		    System.out.println("F");

		    for (int i = 0; i < _4_degiskenli_DogrulukTablosu()[0].length; i++) {
		        for (int j = 0; j < degiskenler.length; j++) {
		            System.out.print(_4_degiskenli_DogrulukTablosu()[j][i] + " ");

		        }
		        System.out.println(getFonksiyonunCiktileri()[i]);
		    }
		} 
	 	  

	public static Map<Character, Map<Integer, Integer>> dogrulukTablosununSutunleri() {
        Map<Character, Map<Integer, Integer>> herdegiskenIcinHemMinterimHemdeSutun = new HashMap<>();

        for (char degisken : degiskenler) {
            Map<Integer, Integer> MinterimSutun = new HashMap<>();
            int[][] tablo = _4_degiskenli_DogrulukTablosu();
            int index = getIndex(degiskenler, degisken);
            for (int i = 0; i< tablo[0].length; i++) {
                int sutun = tablo[index][i];
                MinterimSutun.put(i, sutun);
            }
            herdegiskenIcinHemMinterimHemdeSutun.put(degisken, MinterimSutun);
        }
        return herdegiskenIcinHemMinterimHemdeSutun;
	}

	 private static int getIndex(char[] uniqueKarakterler, char karakter) {
	        for (int i = 0; i < uniqueKarakterler.length; i++) {
	            if (uniqueKarakterler[i] == karakter) {
	                return i;
	            }
	        }
	        return -1; 
	    }
}
