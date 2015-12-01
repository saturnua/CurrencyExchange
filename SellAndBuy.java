package Curency;

public class SellAndBuy {
	
	final CurrencyState currencyState = new CurrencyState(25.00,27.00,0.38);
	
	public String toString(){
		return currencyState.toString();
	}
	
	public double hrnToUsd(double hrn){
		double result = hrn / currencyState.getUsd();
		return result;
	}
	
	public double hrnToEur(double eur){
		double result = eur / currencyState.getEur();
		return result;
	}
	
	public double hrnToRur(double rur){
		double result = rur / currencyState.getRur();
		return result;
	}
	
	public double usdToHrn(double usd){
		double result = usd * currencyState.getUsd();
		return result;
	}
	
	public double eurToHrn(double eur){
		double result = eur * currencyState.getEur();
		return result;
	}
	
	public double rurToHrn(double rur){
		double result = rur * currencyState.getRur();
		return result;
	}
}
