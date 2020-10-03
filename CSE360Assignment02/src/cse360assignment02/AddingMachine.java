package cse360assignment02;

public class AddingMachine {
	
	private int total;
	
	/**
	 * adding a private string to store the transaction history
	 */
	private String result = "";
	
	public static void main(String[] args) {
		
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		
		/**
		 * call toString() method to return the string
		 */
		System.out.print(myCalculator);
	}
	
	  
	  public AddingMachine () {
		 total = 0;
		 result = "0";
	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
		/**
		 * adding the value to total and store the value
		 * into the result string.
		 */
	  public void add (int value) {
		  
		  total = total + value;
		  result = result + " + " + value;
	  }

	  public void subtract (int value) {
		  
		  total = total - value;
		  result = result + " - " + value;
	  }
	  
	  
		/**
		 * return the result string
		 */
	  public String toString () {
	    return result.toString();
	  }
	  
		/**
		 * no description in assignment describe 
		 * what this method should perform
		 */
	  public void clear() {
	  }
}
