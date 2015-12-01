package Curency;

public class Main {
	
	public static void main(String[] args) throws MyExeption{
	
		SellAndBuy sellAndBuy = new SellAndBuy();
		Exchange exchange = new Exchange();
		
		System.out.println(sellAndBuy.toString());
		System.out.println(exchange.toString());
		
		try {
			exchange.startChange();
		} catch (MyExeption e) {
			System.out.println(e);
			System.out.println("Esli hotite mozete obmenyat menshe");
			System.out.println(sellAndBuy.toString());
			System.out.println(exchange.toString());
			exchange.startChange();
		}
	
	}
}