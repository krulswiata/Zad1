package cw5;

public class zad3
{
    public static void main(String[] args) {
        Jeden("Mikolaj","Gajewski",21);

    }

    public static void Jeden(String imię){
        imię = "Mikolaj";
        System.out.println(imię);
    }
    public static void Jeden(String imię, String nazwisko){
        Jeden("Mikolaj");
        nazwisko="Gajewski";
        System.out.println(nazwisko);
    }
    public static void Jeden(String imię, String nazwisko, int wiek){
        Jeden("Mikolaj", "Gajewski");
        wiek=21;
        System.out.println(imię+ nazwisko + wiek);
    }
}

