package ForLoops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 5, 7, 3, 4, 5};
		
		for(int i = 0 ; i < arr.length; i++ ) {
			if(arr[i] == 5) {
				System.out.println(String.format("Found a 5 at index %s", i));
			}
		}
		
	}

}
