import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz");
        int number = inp.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            //1*1*1*1
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + "sayisi bir armstorng sayidir ");
        } else {
            System.out.println(number + "sayisi bir armstrong sayi değildir");
        }






        /*
        int a = 2451, basamaksayisi = 0, numberCounter = 0;

        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0
        // integer türünde tanımlanan her değişken bölüm işlemlerinde integer değer çıkarır
        // bu yüzden her defasında bir basamak düşürmüş oluyoruz

        System.out.println(a);

        while (a != 0) {
            // a değişkeni ise 10 a bölünüp yeni değeri kendisinde atayarak yukarıdaki işlemi döngüye sokmuş oluyoz
            a /= 10;
            //numberCounter değişkenini burada bir arttırarak basamak sayısı her bölüm işlemine göre bulunuyor
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        //üs alma işlemi

        int sub = 2,sup = 5;
        int result = 1;
        for (int i = 1 ; i<=sup;i++){
            result *= sub;
        }
        System.out.println(result);

         */
    }
}
