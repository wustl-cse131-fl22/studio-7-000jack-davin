package studio7;

public class fraction {
	private int numerator;
	private int denominator;
	public fraction(int initNum, int initDenom) {
		numerator = initNum;
		denominator = initDenom;
		
	}
	public void Sum(int numeratorTwo, int denominatorTwo) {
		
		int commonDenominator = denominator * denominatorTwo;
		int numeratorOneAlt = numerator * denominatorTwo;
		int numeratorTwoAlt = numeratorTwo * denominator;
		int numeratorSum = numeratorOneAlt + numeratorTwoAlt;
		
		
		fraction sumFraction = new fraction(numeratorSum, commonDenominator);
	
		sumFraction.printFraction();
		
		
	}
	/**
	 * 
	 * @param numeratorTwo - 
	 * @param denominatorTwo
	 */
	public void Product(fraction f1) {
		int overallDenom = denominator * f1.denominator;
		int overallNumer = numerator * f1.numerator;
		fraction productFraction = new fraction(overallNumer,overallDenom);
		productFraction.simplify();
		productFraction.printFraction();
	}
	
	
	public void Recip() {
		fraction reciprocalFraction = new fraction(denominator,numerator);
		reciprocalFraction.printFraction();
	}
	public void simplify() {
		int simpNumer=0;
		int simpDenom=0;
		int divisor = Math.max(numerator, denominator);
		for(int index=2;index<=divisor;index++) {
			if(numerator%index==0) {
				if(denominator%index==0) {
					simpNumer = numerator/index;
					simpDenom = denominator/index;
				}
			}
		}
		fraction simpleFraction = new fraction (simpNumer,simpDenom);
		simpleFraction.printFraction();
	}
	
	public void printFraction() {
		System.out.println(numerator+"" + "/" + denominator+"");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fraction testFraction = new fraction(1,2);
		fraction testFractionTwo = new fraction(2,3);
		testFraction.printFraction();
		testFraction.Sum(1, 3);
		testFraction.Product(testFractionTwo);
		testFraction.Recip();
		testFraction.simplify();
		
		
		
		
	}

}
