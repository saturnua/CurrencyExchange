package Curency;


import java.util.Scanner;

public class Exchange {
	
	private Scanner sc;
	private SellAndBuy sellAndBuy = new SellAndBuy();
	

	public String toString() {
		String result = sellAndBuy.toString() + "\n";
		 result = "                        to USD insert 1 " + "\n";
		 result += " if you want change HRN to EUR insert 2 "+ "\n";
		 result += "                        to RUR insert 3 "+ "\n";
		 result += "--------------------------------------------------"+ "\n";
		 result += " if you want change USD to HRN insert 4 "+ "\n";
		 result += " if you want change EUR to HRN insert 5 "+ "\n";
		 result += " if you want change RUR to HRN insert 6 "+ "\n";
		 result += "--------------------------------------------------"+ "\n";
		return result;
	}
	
	

	void startChange() throws MyExeption {
		sc = new Scanner(System.in);

		switch (sc.nextInt()) {
		case 1:
			System.out.println("Teper vedite summu HRN v USD");
			Scanner sc1 = new Scanner(System.in);
			Double d = sc1.nextDouble();
			if (d < 1000000){
				System.out.println("Poluchite "
						+ sellAndBuy.hrnToUsd(d) + " USD");
				
			}else{
				throw new MyExeption("Izvinite v kasse zakonchilis dengi");
			}
			break;	
		case 2:
			System.out.println("Teper vedite summu HRN v EUR");
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Poluchite "
					+ sellAndBuy.hrnToEur(sc2.nextDouble()) + " EUR");
			break;
		case 3:
			System.out.println("Teper vedite summu HRN v RUR");
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Poluchite "
					+ sellAndBuy.hrnToRur(sc3.nextDouble()) + " RUR");
			break;
		case 4:
			System.out.println("Teper vedite summu USD v HRN");
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Poluchite "
					+ sellAndBuy.usdToHrn(sc4.nextDouble()) + " HRN");
			break;
		case 5:
			System.out.println("Teper vedite summu EUR v HRN");
			Scanner sc5 = new Scanner(System.in);
			System.out.println("Poluchite "
					+ sellAndBuy.eurToHrn(sc5.nextDouble()) + " HRN");
			break;
		case 6:
			System.out.println("Teper vedite summu RUR v HRN");
			Scanner sc6 = new Scanner(System.in);
			System.out.println("Poluchite "
					+ sellAndBuy.rurToHrn(sc6.nextDouble()) + " HRN");
			break;
		default:
			System.out.println("You choise is wrong, please enter from 1 to 6");
			System.out.println();
			
			toString();
			startChange();
			break;
		}

	}
}
