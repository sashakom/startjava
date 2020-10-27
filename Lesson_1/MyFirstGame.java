public class MyFirstGame {
	public static void main(String[] args) {
		int number = 10;
		int result = 50;
		while (result != number) {
			if (result > number) {
				System.out.println("Result " + result + " less number");
				result = result / 2;
			} else if (result < number) {
				System.out.println("Result " + result + " more number");
				result = result + 1;
			}
		}
		System.out.println("You win!");
	}
}