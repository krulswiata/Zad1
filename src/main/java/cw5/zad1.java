package cw5;

public class zad1
{
    public static void main(String[] args) {
        Jeden();
        Dwa();
    }


    public static int[] Jeden() {
        int[] tab = new int[20];
        int start = 40;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = start;
            start--;
        }
        return tab;
    }

    public static void Dwa(){
        int tab[]=Jeden();
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

}

