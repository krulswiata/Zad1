package cw3;

public class zad2
{
    public static void main(String[] args) {

        String słowo = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        char tab[]=słowo.toCharArray();
        int licznikO =0;
        int licznikP =0;
        int licznikX =0;
        int licznikZ =0;
        int licznikQ =0;
        int licznikDefaultowych=0;
        for (int i = 0; i <= tab.length-1; i++) {
            switch (tab[i]) {
                case 'o':
                    licznikO++;
                    break;
                case 'p':
                    licznikP++;
                    break;
                case 'x':
                    licznikX++;
                    break;
                case 'z':
                    licznikZ++;
                    break;
                case 'q':
                    licznikQ++;
                    break;
                default:
                    licznikDefaultowych++;
                    break;

            }
        }
        System.out.println("ilość o to: "+licznikO);
        System.out.println("ilość p to: "+licznikP);
        System.out.println("ilość x to: "+licznikX);
        System.out.println("ilość z to: "+licznikZ);
        System.out.println("ilość q to: "+licznikQ);
        System.out.println("ilość innych to: "+licznikDefaultowych);

    }
}
}
