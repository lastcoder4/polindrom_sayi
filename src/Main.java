import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayı al
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        // Sayının palindrom olup olmadığını kontrol et ve sonucu yazdır
        if (isPalindrome(number)) {
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }

        input.close();
    }

    // Sayının palindrom olup olmadığını kontrol eden yöntem
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
