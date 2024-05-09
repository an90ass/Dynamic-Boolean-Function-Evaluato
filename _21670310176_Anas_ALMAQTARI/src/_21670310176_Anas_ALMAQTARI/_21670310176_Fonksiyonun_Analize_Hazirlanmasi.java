package _21670310176_Anas_ALMAQTARI;
import java.util.*;
public class _21670310176_Fonksiyonun_Analize_Hazirlanmasi {
	public static String[] terimler() {
	    String[] terimler  = terimlerinAyrimi(_21670310176_dosyaOkuma.boolefunction);
	    return terimler;
	}
	private static String[] terimlerinAyrimi(String boolefunction) {
	    String[] parts = boolefunction.split("=");
	    String rhs = parts[1].trim();
	    String[] kisimler = rhs.split("\\+");
	    String[] ayrilmisTerimler = new String[kisimler.length];
	    for (int i = 0; i < kisimler.length; i++) {
	        ayrilmisTerimler[i] = kisimler[i].trim();
	    }
	    return ayrilmisTerimler;
	}

		public static Map<String, Map<Character, Integer>> terimVeterimdeHerKarakterinDegeriIle(
	            Map<Integer, String> map) {
			
	        Map<String, Map<Character, Integer>> terimlerVeHerKarakterinDegeriIleMap = new HashMap<>();

	        for (Integer key : map.keySet()) {
	            String terim = map.get(key);
	            Map<Character, Integer> degiskenlerinCiktilari = degiskenlerinCiktilari(terim);
	            terimlerVeHerKarakterinDegeriIleMap.put(terim, degiskenlerinCiktilari);
	        }

	        return terimlerVeHerKarakterinDegeriIleMap;
	    }
		private  static Map<Character, Integer> degiskenlerinCiktilari(String terim) {
	        Map<Character, Integer> degiskenVeCiktisi = new HashMap<>();
	        for (int j = 0; j < terim.length(); j++) {
	            char ch = terim.charAt(j);
	            if (terim.charAt(j) != '\'') {
	            	degiskenVeCiktisi.put(ch, (j < terim.length() - 1 && terim.charAt(j + 1) == '\'') ? 0 : 1);
	            }
	        }
	        return degiskenVeCiktisi;
	    }	      
		public static Map<Integer, String> terimdekiHerdegiskenDegerile(String[] terimler) {
		    Map<Integer, String> map = new HashMap<>();
		    for (int i = 0; i < terimler.length; i++) {
		        map.put(i, terimler[i]);
		    }
		    return map;
		}
}
