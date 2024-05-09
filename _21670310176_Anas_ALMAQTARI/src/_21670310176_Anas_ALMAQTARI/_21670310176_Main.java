package _21670310176_Anas_ALMAQTARI;
public class _21670310176_Main {
	public static void main(String[] args) {
		 final String FILE_NAME = "boole.txt";
		_21670310176_dosyaOkuma.dosyaAcmaVeOkuma(FILE_NAME);	
		System.out.println("boole.txt dosyasi okundu.");
		System.out.println("doğruluk tablosu:");
		System.out.println();
		
       _21670310176_dogrulukTablosu.TabloYazdirma();          	
        System.out.println("Fonksiyon İfadeleri:");   	
       _21670310176_Kanonik_ve_Standart_Bicimler.CarimlarinToplami();
       _21670310176_Kanonik_ve_Standart_Bicimler.minterimlerinToplami();
       _21670310176_Kanonik_ve_Standart_Bicimler.ToplamlarinCarpimi();
       _21670310176_Kanonik_ve_Standart_Bicimler.maxterimlerCarpimi();          	
	}
}
