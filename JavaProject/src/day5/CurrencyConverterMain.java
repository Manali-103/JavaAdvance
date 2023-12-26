package day5;

public class CurrencyConverterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConverter converter;
		converter = new DollarToRupeeConverter();
		float usDollars = 10000;
		float inr = converter.doConvert(usDollars);
		System.out.println("$" + usDollars + "=Rs." + inr);
         
		converter = new RupeeToPoundConverter();
		float indianRupees = 100000;
		float gdp = converter.doConvert(indianRupees);
		System.out.println("Rs." + indianRupees + "=" + gdp + "Pounds");
	}

}
