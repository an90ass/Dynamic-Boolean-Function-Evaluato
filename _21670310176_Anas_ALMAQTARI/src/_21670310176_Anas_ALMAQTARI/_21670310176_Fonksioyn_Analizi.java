package _21670310176_Anas_ALMAQTARI;

import java.util.*;
public class _21670310176_Fonksioyn_Analizi {
	static Map<String, Map<Character, ArrayList<Integer>>> ciktilar = new HashMap<>();
	public static Map<Character, Map<Integer, Integer>> TumDegiskenlerinTablodakiSutunuleri() {
	    return _21670310176_dogrulukTablosu.dogrulukTablosununSutunleri();
	}
	public static void teriminVeCiktileri() { 
	    Map<String, Map<Character, Integer>> terimlerVeDegerleri = terimVeherTerimdeHerKarakterinDegeriIle();
	    for (String terim : terimlerVeDegerleri.keySet()) {
	        Map<Character, Integer> terimdekiHerDegiskenDegeri = terimlerVeDegerleri.get(terim);
	        processTerim(terim, terimdekiHerDegiskenDegeri);
	    }
	}

	private static void processTerim(String terim, Map<Character, Integer> terimdekiHerdegiskenDegerile) {
		for (Character degisken : terimdekiHerdegiskenDegerile.keySet()) {
		    int degiskeninDegeri = terimdekiHerdegiskenDegerile.get(degisken);
		    processDegisken(terim, degisken, degiskeninDegeri);
		}
	}
	private static void processDegisken(String terim, char degisken, int degiskeninDegeri) {
		Map<Integer, Integer> HerDegiskeninTablodakiSutunu = TumDegiskenlerinTablodakiSutunuleri().get(degisken);
		ArrayList<Integer> ciktiListesi = new ArrayList<>();
		for (int key : HerDegiskeninTablodakiSutunu.keySet()) {
		    Integer value = HerDegiskeninTablodakiSutunu.get(key);
		    if (value.equals(degiskeninDegeri)) {
		        ciktiListesi.add(key);
		    }
		}		
		ciktilar.putIfAbsent(terim, new HashMap<>());
		ciktilar.get(terim).put(degisken, ciktiListesi);	    
	}
	 public static Map<String, Set<Integer>> herkombiasyonIcinKarsilikMinterimDegeri(
	            Map<String, Map<Character, ArrayList<Integer>>> map) {
	        Map<String, Set<Integer>> kombinasyonVeMinterimi = new HashMap<>();
	        for (String terim : map.keySet()) {
	            Map<Character, ArrayList<Integer>> degiskeninTablodakiBirOlanDegerleri = map.get(terim);
	            Set<Integer> herTerimIcinKisaMinterim = herTerimIcinKisaMinterim(degiskeninTablodakiBirOlanDegerleri);
	            kombinasyonVeMinterimi.put(terim, herTerimIcinKisaMinterim);
	        }
	        varsayilanFonksiyonunCiktileriDuzenleme(kombinasyonVeMinterimi);
	        return kombinasyonVeMinterimi;
	    }
	    private static Set<Integer> herTerimIcinKisaMinterim(Map<Character, ArrayList<Integer>> innerMap) {
	        Set<Integer> KisaMinterim = new HashSet<>();
	        for (ArrayList<Integer> MinterimSayi : innerMap.values()) {
	            if (KisaMinterim.isEmpty()) {
	            	KisaMinterim.addAll(MinterimSayi);
	            } else {
	            	KisaMinterim.retainAll(MinterimSayi);
	            }
	        }
	        return KisaMinterim;
	    }
	    private static void varsayilanFonksiyonunCiktileriDuzenleme(Map<String, Set<Integer>> kombinasyonVeMinterimi) {
	        for (Set<Integer> minterimler : kombinasyonVeMinterimi.values()) {
	            for (Integer minterim : minterimler) {
	                _21670310176_dogrulukTablosu.setFonksiyonunCiktileri(minterim, 1);
	            }
	            }
	        }
		public static Map<String, Map<Character, Integer>> terimVeherTerimdeHerKarakterinDegeriIle() {
		    return _21670310176_Fonksiyonun_Analize_Hazirlanmasi
		            .terimVeterimdeHerKarakterinDegeriIle(_21670310176_Fonksiyonun_Analize_Hazirlanmasi
		                    .terimdekiHerdegiskenDegerile(_21670310176_Fonksiyonun_Analize_Hazirlanmasi.terimler()));
		}
}