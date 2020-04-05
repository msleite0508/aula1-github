package util;

public class CurrenciConverter {
	
	public static double IOF = 0.06;

	public static double valorFinalReais (double valorDolar, double reais) {
		return valorDolar * reais * (1.0 + IOF);
	}
	
}