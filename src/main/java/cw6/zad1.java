package cw6;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class zad1
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<String>();
        String zwierze;
        int i=0;
        while(i <= 5) {
            System.out.print("Podaj nastepne zwierze: ");
            zwierze = scanner.nextLine();
            stringList.add(zwierze);
            i++;
        }
        System.out.println("Lista zwierzat:");
        pokazZwierzeta(stringList);
        stringList.remove(4);
        stringList.remove(3);
        System.out.println("Zwierzeta po usunięciu:");
        pokazZwierzeta(stringList);
        System.out.println("Wielkosc po usunieciu: " + stringList.size());
        Collections.sort(stringList, Collections.reverseOrder());
        System.out.println("Sortowanie: ");
        pokazZwierzeta(stringList);



    }
    public static void pokazZwierzeta(List<String> stringList){
        for (String nazwa : stringList) {
            System.out.println(nazwa);
        }
    }

}

