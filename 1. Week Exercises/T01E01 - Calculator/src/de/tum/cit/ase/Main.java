package de.tum.cit.ase;

public final class Main {
	public static void main(String[] args) {
		// TODO: Test your code here
		Calculator calculator = new Calculator();
		System.out.println(calculator.getStoredValue());

		Calculator calculator1 = new Calculator("100");
		System.out.println(calculator1.getStoredValue());

		Calculator calculator2 = new Calculator("200");
		System.out.println(calculator2.getStoredValue());

		calculator1.add("50");
		System.out.println(calculator1.getStoredValue());

		calculator2.subtract("50");
		System.out.println(calculator2.getStoredValue());

		System.out.println(calculator1.toString());
	}
}