package cw1;

public class zad2 {
    public static void main(String[] args) {
        int tab[] = new int[5];
        tab[0]=7;
        tab[1]=4;
        tab[2]=3;
        tab[3]=6;
        tab[4]=17;
        int i =2;
        while(i<=tab.length-1){
            System.out.println(tab[i]);
            i++;
        }

        double tab2[] = new double[5];
        tab2[0]= 4.0;
        tab2[1]= 3.0;
        tab2[2]= 8.0;
        tab2[3]= 3.5;
        tab2[4]= 11.9;
        int i2 = 0;
        while(i2<=tab2.length-1){
            System.out.println(tab2[i2]);
            i2++;
        }

        String tab3[] = new String[5];
        tab3[0] = "0";
        tab3[1] = "4";
        tab3[2] = "6";
        tab3[3] = "2";
        tab3[4] = "9";
        int i3 =0;
        while(i3<=tab3.length-1){
            System.out.println(tab3[i3]);
            i3++;
        }


    }
}