package Curency;

import java.util.Scanner;

public class Exchange {
	
	public static void change(){
		System.out.println("                        to USD insert 1 ");
		System.out.println(" if you want change HRN to EUR insert 2 ");
		System.out.println("                        to RUR insert 3 ");
		System.out.println("--------------------------------------------------");
		System.out.println(" if you want change USD to HRN insert 5 ");
		System.out.println(" if you want change EUR to HRN insert 6 ");
		System.out.println(" if you want change RUR to HRN insert 7 ");
		System.out.println("--------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		switch (sc.nextInt()) {
            case 1:
            	System.out.println("Teper vedite summu HRN v USD");
            	Scanner sc1 = new Scanner(System.in);
            	System.out.println("Poluchite " + Formulas.hrnToUsd(sc1.nextDouble()) + " USD");
                break;
            case 2:
            	System.out.println("Teper vedite summu HRN v EUR");
            	Scanner sc2 = new Scanner(System.in);
            	System.out.println("Poluchite " + Formulas.hrnToEur(sc2.nextDouble()) + " EUR");
                break;
            case 3:
            	System.out.println("Teper vedite summu HRN v RUR");
            	Scanner sc3 = new Scanner(System.in);
            	System.out.println("Poluchite " + Formulas.hrnToRur(sc3.nextDouble()) + " RUR");
                break;
            case 4:
            	System.out.println("Teper vedite summu USD v HRN");
            	Scanner sc4 = new Scanner(System.in);
            	System.out.println("Poluchite " + Formulas.usdToHrn(sc4.nextDouble()) + " HRN");
                break;
            case 5:
            	System.out.println("Teper vedite summu EUR v HRN");
            	Scanner sc5 = new Scanner(System.in);
            	System.out.println("Poluchite " + Formulas.eurToHrn(sc5.nextDouble()) + " HRN");
                break;
            case 6:
            	System.out.println("Teper vedite summu RUR v HRN");
            	Scanner sc6 = new Scanner(System.in);
            	System.out.println("Poluchite " + Formulas.rurToHrn(sc6.nextDouble()) + " HRN");
                break;
            default: 
                System.out.println("You choise is wrong, please enter from 1 to 6");
                System.out.println();
                change();
                break;
        }	
	}
}
