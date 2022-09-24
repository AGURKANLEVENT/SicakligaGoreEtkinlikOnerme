
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int sicaklik;

      Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen Sıcaklık Değeri Giriniz : ");
        sicaklik = inp.nextInt();

        switch (sicaklik){

            case 1,2,3,4,5:
                System.out.println("Kayak Yapabilirsiniz.");
                break;
            case 6,7,8,9,10,11,12,13,14,15:
                System.out.println("Sinemaya gidebilirsiniz.");
                break;
            case 16,17,18,19,20,21,22,23,24,25:
                System.out.println("Pikniğe gidebilirsiniz");
                break;
            case 26,27,28,29,30,31,32,33,34,35:
                System.out.println("Yüzmeye Gidebilirsiniz.");
                break;
            default:
                System.out.println("35'derece Üstü Sıcaklık Değerlerinde Dışarı Çıkmanız sağlığınıza Zararlı olabilir!!");
        }

    }
}