package Curency;

public class Formulas {
	
	public static double hrnToUsd(double hrn){
		double result = hrn / CurrencyState.getUsd();
		return result;
	}
	
	public static double hrnToEur(double eur){
		double result = eur / CurrencyState.getEur();
		return result;
	}
	
	public static double hrnToRur(double rur){
		double result = rur / CurrencyState.getRur();
		return result;
	}
	
	public static double usdToHrn(double usd){
		double result = usd * CurrencyState.getUsd();
		return result;
	}
	
	public static double eurToHrn(double eur){
		double result = eur * CurrencyState.getEur();
		return result;
	}
	
	public static double rurToHrn(double rur){
		double result = rur * CurrencyState.getRur();
		return result;
	}
}
