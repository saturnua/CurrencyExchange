package Curency;


public class CurrencyState {
	
	private double usd;
	private double eur;
	private double rur;
	
	public CurrencyState (double usd, double eur, double rur){	
		this.usd = usd;
		this.eur = eur;
		this.rur = rur;
	}
	
	public String toString(){
		String result = "--------------------------------------------------"+ "\n";
		result += "Kursy stanom on " + TodayData.todayDate() + "\n";
		result += " 1 -    USD -  " + usd + "\n";
		result += " 2 -    EUR -  " + eur + "\n";
		result += " 3 -    RUR -  " + rur + "\n";
		result += "--------------------------------------------------"+ "\n";
		return result;
	}
	
	public double getUsd(){
		return usd;
	}
	public double getEur(){
		return eur;
	}
	public double getRur(){
		return rur;
	}

	public static void setCurencys(double d, double e, double f) {
		// TODO Auto-generated method stub
		
	}
		
}

