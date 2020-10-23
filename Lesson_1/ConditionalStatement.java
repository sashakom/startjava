public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		if (age > 20) {
			System.out.println("You more 20");
		}

		char sex = 'm';
		if (sex == 'm') {
			System.out.println("You are man");
		}

		if (sex == 'f') {
			System.out.println("You are woman");
		}

		float height = 1.70f;
		if (height < 1.80f) {
			System.out.println("You small");
		} else {
			System.out.println("You tall");
		}

		char name = 'M';
		if (name == 'M') {
			System.out.println("You are mmm");
		} else if (name == 'I') {
			System.out.println("You are iii");
		} else {
			System.out.println("You unknown");
		}
	}
}