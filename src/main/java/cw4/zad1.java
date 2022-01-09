package cw4;

public class zad1
{
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            if (i == 5) {
                break;
            }
        }
        for (int j = 0; j < 20; j++) {
            if (j ==5){
                System.out.println("szóstka");
                continue;
            }if (j==10){
                break;
            }
        }
        for (int k = 0; k < 20; k++) {
            if (k==2){
                System.out.println("siódemka");
                return;
            }
            System.out.println("liczba");
        }

    }
}


