package cw2;
import java.util.Scanner;
public class zad2
{
    public static void main(String[] args) {
        int[] tab = new int[5];
        Scanner skan = new Scanner(System.in);
        System.out.println("0");
        tab[0] = skan.nextInt();
        System.out.println("1");
        tab[1] = skan.nextInt();
        System.out.println("2");
        tab[2] = skan.nextInt();
        System.out.println("3");
        tab[3] = skan.nextInt();
        System.out.println('4');
        tab[4] = skan.nextInt();
        for (int zmienna : tab)
        {
            System.out.println(tab[zmienna - 1] + 11);
        }


    }
}

