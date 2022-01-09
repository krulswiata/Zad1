package cw6;
import java.util.*;
public class zad2
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> liczby = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj liczbę: ");
            liczba = scanner.nextInt();
            liczby.add(liczba);

        }

        Collections.sort(liczby);
        System.out.println("Liczby: " + liczby);
        Set<Integer> liczby2 = new TreeSet<>(liczby);
        System.out.println("Liczby set: " + liczby2);

        for (Integer numbers : liczby2) {
            System.out.print(numbers);

        }
    }
}

