package armstrong;
import java.util.Scanner;
public class ArmStrong {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
 
    System.out.print("Sayı Giriniz: ");
    int number = input.nextInt();
    System.out.print("Basamak Sayısı: ");
    int basamak_sayisi = input.nextInt();
    
    int gecici_sayi = number;
    int sum = 0;
    
   
    do {
        int basamak_degeri = gecici_sayi % 10;
        gecici_sayi /= 10;
        
        sum += Math.pow(basamak_degeri, basamak_sayisi);
                                            
    } while(gecici_sayi > 0);
    
    
    if(number == sum) {
        System.out.println("Bu Sayı Bir Armstrong Sayısıdır");    
    }
    
 
    else {
        System.out.println("Bu Sayı Bir Armstrong Sayısı Değildir");
    }
 
    
 
    }
    
}