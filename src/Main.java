import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();
        boolean check = true;
        int tausend=0;
        int hundert=0;
        int zehn=0;
        int eins=0;

        //System.out.println(zahl);
        while (check == true) {
            if (zahl > 1000) {
                tausend = zahl/1000;
                System.out.print(tausend + " + ");
                zahl = zahl - ((zahl / 1000) * 1000);

            }
            if (zahl > 100) {
                hundert = zahl / 100;
                System.out.print(hundert + " + ");
                zahl = zahl - ((zahl / 100) * 100);

            }
            if (zahl > 10) {
                zehn = zahl / 10;
                System.out.print(zehn + " + ");
                zahl = zahl - ((zahl / 10) * 10);

            }
            if (zahl > 1) {
                eins = zahl / 1;
                System.out.print(eins);
                zahl = zahl - ((zahl / 1) * 1);
            } else {
                check = false;
            }
            System.out.println(" Quersumme entspricht = " + tausend+hundert+zehn+eins);//

        }
    }
}