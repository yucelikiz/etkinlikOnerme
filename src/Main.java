import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //değişkenler
        double temp;

        //Scanner nesnesi
        Scanner inpt = new Scanner(System.in);

        //Sıcaklık değerini al
        System.out.print("Hava sıcaklığını derece olarak giriniz: ");
        temp = inpt.nextDouble();

        //Öneride bulun
        if (temp<5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if (temp>=5 && temp<=15) {
            System.out.print("Sinemaya gidebilirsiniz.");
        } else if (temp>15 && temp<=25) {
            System.out.print("Pikniğe gidebilirsiniz.");
        } else if (temp>25) {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }else {
            System.out.print("Hatalı bir giriş yaptınız!");
        }

    }
}