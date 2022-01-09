package cw5;
import java.util.Scanner;
public class zad2
{
    public static void main(String[] args) {
        Dwa();

    }


    public static String[] Jeden(){
        String[] tab = new String[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pokaz 6 wartosci: ");
        tab[0]=scanner.next();
        tab[1]=scanner.next();
        tab[2]=scanner.next();
        tab[3]=scanner.next();
        tab[4]=scanner.next();
        tab[5]=scanner.next();
        return tab;


    }


    public static void Dwa(){
        String[] tab =Jeden();
        for (int i = tab.length-1; i >=0 ; i--) {
            System.out.println(tab[i]);


        }
    }
}

