package Module2.Assignments;

/**
 * The Currency class converts an amount of money from a specific country into
 * the equivalent currency of another country given the current exchange rate.
 *
 * @author Erikas Taroza
 * @version 09/3/20
 */
public class CurrencyV1 {
	public static void main(String[] args) {
		// Declare and initialize local variables
		double startingUsDollars = 6500.00; // starting US Dollars

		double pesosSpent = 7210.25; // Mexican Pesos spent
		double pesoExchangeRate = 19.57852; // 1 US dollar = 19.57852 Pesos
		//double dollarsSpentInMexico = 0.0; // US dollars spent in Mexico
		double dollarsAfterMexico = 0.0; // US dollars remaining after Mexico
		// remaining variables below here

		//Australia
		double audSpent = 2342.19;
		double audExchangeRate = 1.361092;
		double dollarsAfterAus = 0.0;

		//Germany
		double euroSpent = 2000.00;
		double euroExchangeRate = 0.841377;
		double dollarsAfterGer = 0.0;

		// Message to user stating purpose
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("This program converts an amount of money");
		System.out.println("from a specific country into the equivalent");
		System.out.println("currency of another country given the current");
		System.out.println("exchange rate.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();

		//Starting
		System.out.println("Starting USD: " + startingUsDollars);
		System.out.println();

		//Mexico
		dollarsAfterMexico = printExchange("Mexico", "Pesos", pesosSpent, pesoExchangeRate, startingUsDollars);
		startingUsDollars = dollarsAfterMexico;

		//Australia
		dollarsAfterAus = printExchange("Australia", "Australian Dollar", audSpent, audExchangeRate, startingUsDollars);
		startingUsDollars = dollarsAfterAus;

		//Germany
		dollarsAfterGer = printExchange("Germany", "Euro", euroSpent, euroExchangeRate, startingUsDollars);
		startingUsDollars = dollarsAfterGer;

		// Complete the code below for Souvenir Purchases
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// Calculations for Souvenir #1
		int costItem1 = 12; // cost per item of first souvenir
		int budget1 = 100; // budget for first item
		int totalItems1 = (int)(budget1 / costItem1); // how many items can be purchased
		int fundsRemaining1 = budget1 - totalItems1 * costItem1; // how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1);
		System.out.println("   Budget: $" + budget1);
		System.out.println("   Total items purchased: " + totalItems1);
		System.out.println("   Funds remaining: $" + fundsRemaining1);
		System.out.println();

		// Calculations for Souvenir #2
		double costItem2 = 29.99; // cost per item of second souvenir
		int budget2 = 500; // budget for second item
		int totalItems2 = (int)(budget2 / costItem2); // how many items can be purchased
		double fundsRemaining2 = budget2 - totalItems2 * costItem2; // how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2);
		System.out.println("   Budget: $" + budget2);
		System.out.println("   Total items purchased: " + totalItems2);
		System.out.println("   Funds remaining: $" + fundsRemaining2);

	} // end of main method

	private static double printExchange(String region, String currency, double localCurrencySpent, double localCurrencyExchangeRate, double currentUSDAmount){
		double remainingAmount = 0.0;
		double spentInUSD = 0.0;
		System.out.println(region + ":");
		System.out.println(currency + " Spent: " + localCurrencySpent);
		spentInUSD = localCurrencySpent / localCurrencyExchangeRate;
		System.out.println("US Dollars Equivalent: " + spentInUSD);
		remainingAmount = currentUSDAmount - spentInUSD;
		System.out.println("US Dollars Remaining: " + remainingAmount);
		System.out.println();

		return remainingAmount;
	}

} // end of class
