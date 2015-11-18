package Curency;


public class CurrencyState {
	
	private static double usd;
	private static double eur;
	private static double rur;
	
	static public void setCurencys (double usd, double eur, double rur){
		
		CurrencyState.usd = usd;
		CurrencyState.eur = eur;
		CurrencyState.rur = rur;
	}
	
	static public void getCurencys(){
		System.out.println("--------------------------------------------------");
		System.out.println("Kursy stanom on " + TodayData.todayDate());
		System.out.println();
		System.out.println(" 1 -    USD -  " + usd);
		System.out.println(" 2 -    EUR -  " + eur);
		System.out.println(" 3 -    RUR -  " + rur);
		System.out.println("--------------------------------------------------");
	}
	
	static public double getUsd(){
		return usd;
	}
	static public double getEur(){
		return eur;
	}
	static public double getRur(){
		return rur;
	}
		
}
