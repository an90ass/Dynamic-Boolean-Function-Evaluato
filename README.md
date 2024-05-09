# Dynamic-Boolean-Function-Evaluato

#Genel bakış
## Uygulama çalıştığında ilk olarak “boole.txt” adındaki dosyayı okumalıdır. “boole.txt” dosyasında 4-değişkenli ve çarpımların toplamı şeklindeki bir boole fonksiyonu yer almaktadır.
## Boole fonksiyonunu oluşturan her bir bileşen birbirinden boşluk karakteri ile ayrılmıştır. Çarpım terimlerini oluşturan literaller (normal veya tümleyen formdaki) bitişik yazılmaktadır.
## Fonksiyonun ve ikili değişkenlerin isimleri tek karakterlidir fakat fonksiyon ve değişken isimleri değişebilir.

Program şu üç şeyi ekrana çıktı olarak vermeliyor:
- Dosyadaki boole fonksiyonuna karşılık gelen doğruluk tablosu
- Boole fonksiyonunun minterimlerin toplamı şeklindeki ifadesi (Hem kısa hem de açık şekilde)
- Boole fonksiyonunun maksterimlerin çarpımı şeklindeki ifadesi (Hem kısa hem de açık şekilde)

Örnek :
boole.txt dosyası okundu.
doğruluk tablosu:
A B C D F
0 0 0 0 0
0 0 0 1 0
0 0 1 0 0
0 0 1 1 1
0 1 0 0 1
0 1 0 1 0
0 1 1 0 0
0 1 1 1 1
1 0 0 0 1
1 0 0 1 1
1 0 1 0 1
1 0 1 1 1
1 1 0 0 1
1 1 0 1 1
1 1 1 0 1
1 1 1 1 1
Fonksiyon İfadeleri:
F = A’B’CD + A’BC’D’ + A’BCD + AB’C’D’ + AB’C’D + AB’CD’ + AB’CD + ABC’D’ + ABC’D + ABCD’ + ABCD
F = Σ(3, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15)
F = (A + B + C + D).(A + B + C + D’).(A + B + C’ + D).(A + B’ + C + D’).(A + B’ + C’ + D)
F = ∏(0, 1, 2, 5, 6)

