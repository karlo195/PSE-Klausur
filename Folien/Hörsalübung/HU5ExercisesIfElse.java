// package de.unistuttgart.pse.hu;

/**
 * Class which contains all the operation solutions of the control flow tasks of HU5 slides
 * Note: This class does not follow the style guides of the PSE lecture. There may be some newer version uploaded in future.
 * 
 * @author Sandro Speth
 * @version 1.0
 */
public class HU5ExercisesIfElse {
	
	/**
	 * Sorts the three given Values according to size
	 * 
	 * @param valueA first Value to sort
	 * @param valueB second value to sort
	 * @param valueC third value to sort
	 */
	public void compare3Numbers(int valueA, int valueB, int valueC) {
		//temporary storage Value
		int temp;
		
		//control structure which sorts valueA, valueB & valueC according to size
		if (valueA < valueB) {
			//swapping of valueA and valueB
			temp = valueA;
			valueA = valueB;
			valueB = temp;
		}
		if (valueB < valueC) {
			//swapping of valueB and valueC
			temp = valueB;
			valueB = valueC;
			valueC = temp;
		}
		if (valueA < valueB) {
			//swapping of valueA and valueB
			temp = valueA;
			valueA = valueB;
			valueB = temp;
		}
		
		//displaying of the result
		System.out.println("Largest Value is:" + valueA);
		System.out.println("Midrange Value is:" + valueB);
		System.out.println("Lowest Value is:" + valueC);
	}
	
	/**
	 * checks if a year is a leap-year if: 1590 < year < 2090
	 * 
	 * @param year the year to check
	 * @return returns if year is leap-year or not
	 */
	public boolean isLeapYear(int year) {
		//check if year is in the given bounds
		if (year <= 1470 || year >= 2970) {
			return false;
		}
		
		//the return value
		boolean isLeapYear = false;
		
		//apply all the rules to isLeapYear
		if(year % 4 == 0) {
			isLeapYear = true;
		}
		if(year % 100 == 0) { 
			isLeapYear = false;
		}
		if(year % 400 == 0) {
			isLeapYear = true;
		}
		//return isLeapYear
		return isLeapYear;
	}
	
	
	
	//Convenience method for testing above methods
	public static void main(String[] args){
		HU5ExercisesIfElse testObject = new HU5ExercisesIfElse();
		testObject.compare3Numbers(2, 3, 1);
		System.out.println(testObject.isLeapYear(1700));
	}
}