package util;

public class CurrencyConverter {
	public static double iof = 0.06;

	public static double calc(double dolarPrice, double dolarAmount) {
		return dolarPrice*dolarAmount*(1.0 + iof);
	}
}
