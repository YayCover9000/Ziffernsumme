import java.util.Arrays;
import java.util.Scanner;
public class Aufgabe20_Ziffernsumme {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		//int input = sc.nextInt();
		
		//Version1
		String eingabe = "4711";
		int ausgabe = 0;
		// erzeugt dir ein Array mit der Länge des Eingabestrings (also deiner zahl)
		int[] intArray = new int[eingabe.length()];		
		// jetzt befüllst Du Dein Array 
		for (int i = 0; i < eingabe.length(); i ++) {
			// du holst dir das nächste Zeichen und wandelst es in ein int um, da aber laut ASCII-Tabelle die Null den Wert 48, die Eins den Wert 49,... hat musst du noch 48 abziehen
			intArray[i] = eingabe.charAt(i) - 48;
			// und aus diesem Array kannst Du dann wieder leicht die einzelnen Ziffern aufsummieren
		}
		//Version 1A
		for(int e: intArray) {
			//System.out.println(e);
			ausgabe += e;
		}
//		for(int i = 1; i < intArray.length;i++) {
//			//System.out.println("element" + (Arrays.toString(intArray))+"is " + intArray[i]);
//			ausgabe = intArray[i];
//		}
		System.out.println("\nAusgabe: " + ausgabe + "\n");
		
		
		//Version2
		int zahl = 4711;
		int summe;
		int ziffer;
		
		//Vorbereitung der Schleife
		
		summe = 0;	//noch keine summe aufsummiert
		
		// wiederholtes Abtrennen der letzten Ziffer als Rest der ganzzahligen Division durch 10 -  *solange* es Ziffern gibt:
		
		while(zahl > 0) {
			ziffer = zahl % 10;	//die letzte Ziffer
			//System.out.println(ziffer);
			summe = summe + ziffer;		 	// summe wird um den Wert der Ziffer erhöht
			zahl = zahl / 10;               // die letzte Ziffer wird entfernt
			
		}
		System.out.println("Ausgabe: " + summe);
	}
}
