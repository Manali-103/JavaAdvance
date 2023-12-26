package day5;

public class DollarToRupeeConverter implements CurrencyConverter {

	@Override
	public float doConvert(float amountInDollars) {
		float indianRupees = amountInDollars * DOLLAR_TO_RUPEE;
		
		return indianRupees;
	}

}
