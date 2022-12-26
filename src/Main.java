import java.util.Scanner;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int yil , deger;
        String burc = " ";
        boolean isError=false;

        System.out.print("Hangi yılda doğdunuz: ");
        yil = input.nextInt();

        deger = yil % 12;

        switch (deger){
            case 0:
                burc = "Maymun";
                break;

            case 1:
                burc = "Horoz";
                break;

            case 2:
                burc = "Köpek";
                break;

            case 3:
                burc = "Domuz";
                break;

            case 4:
                burc = "Fare";
                break;

            case 5:
                burc = "öküz";
                break;

            case 6:
                burc = "Kaplan";
                break;

            case 7:
                burc = "Tavşan";
                break;

            case 8:
                burc = "Ejderha";
                break;

            case 9:
                burc = "Yılan";
                break;

            case 10:
                burc = "at";
                break;

            case 11:
                burc = "Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz : " +burc);

    }
}