package unsercafe;

public class DieBohne {

	public static void main(String[] args) {
		System.out.println("willkommen in unserem Cofe \"die Bohne\" \n");
		String lieblingsSorte;
		lieblingsSorte = "Latte Macchiato";

		double preiseLiebligsSorte = 3.99;
		int bestellNummerLibliengsSorte = 3;
		System.out.println("unser" + lieblingsSorte + "kostet" + preiseLiebligsSorte + " bestrellung mit "
				+ bestellNummerLibliengsSorte);
		preiseLiebligsSorte = 4.99;
		System.out.println("unser" + lieblingsSorte + "kostet" + preiseLiebligsSorte + " bestrellung mit "
				+ bestellNummerLibliengsSorte);

		String kalteSorte = "Eiskaffe";
		double preice = 5.99;
		int bestellNummerKaltsSorte = 5;
		System.out.println("unser " + kalteSorte + "kostet " + preice + " bestrellung mit " + bestellNummerKaltsSorte);

		String saftSorte = "OrangenSaft";
		double preisSaftSorte = 8.50;
		int bestellNummerSaftSorte = 8;
		System.out.println(
				"unser " + saftSorte + "mit bestellnummer " + bestellNummerSaftSorte + " kostet " + preisSaftSorte);

		String alkoholischeSorten = "Wein";
		double preiseAlkoholischeSorte = 10.30;
		int bestellNummerAlkoholischeSorte = 2;
		int mindesAlter = 18;
		System.out.println("unser " + alkoholischeSorten + " mit bestellnummer " + bestellNummerAlkoholischeSorte
				+ " kostet " + preiseAlkoholischeSorte);  

		// TODO: weitere Sorte , Preise, Bestellnummern erfinden
		System.out.println(" welche sorte möchten sie haben? gib bitte Bestelllnummer ein");
		int wünschnummer = new java.util.Scanner(System.in).nextInt();
		System.out.println("Eingegeben wurde die wümschnummer " + wünschnummer);

		boolean stimmenNummerueberein = (wünschnummer == bestellNummerLibliengsSorte);
		System.out.println(
				"stimmen die eingabe und bestellnumemer meiner lieblinssorte überein " + stimmenNummerueberein);

		if (stimmenNummerueberein) {
			System.out.println("Ihre " + lieblingsSorte + "ist vorbreitet");
		} else {
			stimmenNummerueberein = (wünschnummer == bestellNummerKaltsSorte);
			if (stimmenNummerueberein) {
				System.out.println("der" + kalteSorte + "kommt gleich");
			} else {
				System.out.println("Die <Sorte ist ausverkauft");
			}
		}
		System.out.println(" In welchen Alter sind Sie? ");
		int alter = new java.util.Scanner(System.in).nextInt();
		System.out.println("Welche Bestellungsnummer haben Sie? ");
		bestellNummerAlkoholischeSorte= new java.util.Scanner(System.in).nextInt();
		
		if (alter > mindesAlter && bestellNummerAlkoholischeSorte == 2) {
			System.out.println("Zutritt gewährt!");
		}else { System.out.println("Zutritt verweigert!");

		
		System.out.println("Wie viel Euro haben sie bezahlt?");
		int bestellwert = new java.util.Scanner(System.in).nextInt();
		int mindesbestellwert = 15 ;
		if (bestellwert < mindesbestellwert) {
			System.out.println("Sie haben mit " + bestellwert + "Euro  Mindesbeestellwert nicht erreicht");
		} else {
			System.out.println("vielen Dank für Ihre Einkauf");
		}
		}
		System.out.println("bis bald in unserem cafe\t\"die Bohne\"");
	}// Ende des Program

}
