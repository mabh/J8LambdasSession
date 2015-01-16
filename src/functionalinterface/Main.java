package functionalinterface;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ICommand<Integer> incrementor = x -> {
			System.out.println(x + 1);
		};
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		list.forEach(x -> {
			incrementor.execute(x);
		});
		
		
	}
}
