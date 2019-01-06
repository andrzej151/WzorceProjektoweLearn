package zamianasystemow;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opcja = "";
		Interpreter RND = new RzymNaDz();
		Interpreter DNR = new DzNaRzym();
		Scanner odczyt = new Scanner(System.in);

		//// testy
		for (int i = 0; i < 1004; i++) {
			DNR.interpretuj(i + "");
			// System.out.println(DNR.wynik()+"
			// "+((String)DNR.wynik()).substring(((String)DNR.wynik()).indexOf("=")+1));

			RND.interpretuj(((String) DNR.wynik()).substring(((String) DNR.wynik()).indexOf("=") + 1));
			if (i != (Integer.parseInt(

					((String) RND.wynik()).substring(((String) RND.wynik()).indexOf("=") + 1)))) {
				System.out.println("Blad " + i + " = " + RND.wynik().toString());
			}
		}

		do {
			System.out.println(
					"Podaj liczbe do zinterpretowania w systemie:" + "\n-dziesietnym \n-Rzymskim \n-e,E koniec pracy");

			opcja = odczyt.nextLine();
			
			if (RND.interpretuj(opcja)) {
				System.out.println("WYNIK 1:" + (String) RND.wynik());
			}else if (DNR.interpretuj(opcja)) {
				System.out.println("WYNIK 2:" + (String) DNR.wynik());
			} else  if (!(opcja.equals("E") || opcja.equals("e"))) {
				System.out.println("WYNIK 3: NIE MOZNA ZINTERPRETOWAC");
			}

		} while (!(opcja.equals("E") || opcja.equals("e")));
	}

}
