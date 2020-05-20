package Interfaces;

public interface Math {
	// MY CODE -- >
	static double pow(double value1, double value2) {
		// Time complexity -- > O(value2)
		// Space complexity -- > O(1)
		
		double returnValue = 1;
		for(int i = 0 ; i < value2; i++) {
			returnValue *= value1;
		}
		
		return returnValue;
	}
}
