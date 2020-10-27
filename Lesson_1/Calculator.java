public class Calculator {
	public static void main(String[] args) {
		String operator = "^";
		int first = 11;
		int second = 3;
		if (operator == "+") {
			int sum = first + second;
			System.out.println("Sum = " + sum);
		} else if (operator == "-") {
			int mul = first - second;
			System.out.println("Mul = " + mul);
		} else if (operator == "*") {
			int mut = first * second;
			System.out.println("Mut = " + mut);
		} else if (operator == "/") {
			int div = first / second;
			System.out.println("Div = " + div);
		} else if (operator == "^") {
			int sq = 1;
			for (int i = 1; i <= second; i++) {
				sq *= first;
			}
			System.out.println("Sq = " + sq);
		} else if (operator == "%") {
			int mod = first % second;
			System.out.println("Mod = " + mod);
		}
	}
}