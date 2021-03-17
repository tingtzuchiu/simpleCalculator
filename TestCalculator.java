import OOPCalculator.*;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OOPCalculator calc = new OOPCalculator();
		while(calc.askCalcChoice() != 5) {
			calc.askTwoValues();
			calc.displayResults();
		}
		calc.displayBye();

	}

}
