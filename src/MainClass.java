import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String raspuns;
		do {
			System.out.print("Alegeti o figure geometrica (1 - patrat; 2 - dreptunghi; 3 - cerc; 4 - triunghi): ");
			int varianta = input.nextInt();

			switch (varianta) {
			case 1:
				patrat();
				break;

			case 2:
				dreptunghi();
				break;

			case 3:
				cerc();
				break;

			case 4:
				triunghi();
				break;

			}
			System.out.print("Mai doriti sa continuati (da sau nu): ");
			raspuns = input.next();
		} while (raspuns.equals("da"));
		input.close();

	}

	public static void patrat() {
		Patrat patrat1 = new Patrat();
		Scanner input = new Scanner(System.in);

		System.out.print("Introduceti latura: ");
		int lat = input.nextInt();
		patrat1.setX(lat);

		System.out.print("Ce doriti sa calculati (1 - aria; 2 - perimetrul): ");
		int varianta = input.nextInt();

		switch (varianta) {
		case 1:
			patrat1.arie();
			break;
		case 2:
			patrat1.perimetru();
			break;

		}

	}

	public static void dreptunghi() {
		Dreptunghi dreptunghi1 = new Dreptunghi();
		Scanner input = new Scanner(System.in);

		System.out.print("Introfuceti latimea: ");
		int latime = input.nextInt();
		dreptunghi1.setX(latime);

		System.out.print("Introfuceti lungimea: ");
		int lungime = input.nextInt();
		dreptunghi1.setY(lungime);

		System.out.print("Ce doriti sa calculati (1 - aria; 2 - perimetrul): ");
		int varianta = input.nextInt();

		switch (varianta) {
		case 1:
			dreptunghi1.arie();
			break;
		case 2:
			dreptunghi1.perimetru();
			break;

		}

	}

	public static void cerc() {
		Cerc cerc1 = new Cerc();
		Scanner input = new Scanner(System.in);

		System.out.println("Introduceti raza cercului: ");
		double raza = input.nextDouble();
		cerc1.setR(raza);

		System.out.print("Ce doriti sa calculati (1 - Aria discului; 2 - Circumferinta discului): ");
		int varianta = input.nextInt();

		switch (varianta) {
		case 1:
			cerc1.arie();
			break;
		case 2:
			cerc1.perimetru();
			break;

		}
	}

	public static void triunghi() {
		Triunghi triunghi1 = new Triunghi();
		Scanner input = new Scanner(System.in);

		System.out.print("Introduceti latura 1: ");
		int lat1 = input.nextInt();
		triunghi1.setX(lat1);

		System.out.print("Introduceti latura 2: ");
		int lat2 = input.nextInt();
		triunghi1.setX(lat2);

		System.out.print("Introduceti latura 3: ");
		int lat3 = input.nextInt();
		triunghi1.setX(lat3);

		System.out.print("Ce doriti sa calculati (1 - Aria triunghiului; 2 - Perimetrul triunghiului): ");
		int varianta = input.nextInt();

		switch (varianta) {
		case 1:
			triunghi1.arie();
			break;

		case 2:
			triunghi1.perimetru();
			break;

		}

	}

}
