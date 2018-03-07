
public class App {

	public static void main(String[] args) {
		int [] values;
		values = new int [3];
		System.out.println(values[0]);
		values[0]=10;
		System.out.println(values[0]);
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
			
		}
		
		int[] numbers= {4,5,6,6,6};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
