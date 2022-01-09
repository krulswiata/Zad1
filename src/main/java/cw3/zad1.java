package cw3;
import java.util.Scanner;
public class zad1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę");
        int i = scanner.nextInt();
        switch (i%2) {
            case 0:
                System.out.println("liczba jest parzysta");
                break;
            default:
                System.out.println("liczba nie jest parzysta");
                break;

           // switch (i%7){
             //   case 0:
               //     System.out.println("liczba jest podzielna przez 7");
                //default:
                  //  System.out.println("nie jest podzielna przez 7");
           // }



        }





}

