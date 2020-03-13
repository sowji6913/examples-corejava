import java.util.Scanner;

public class Pubg {

	public static void main(String[] args) {
		int age;
		String gender;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		age = sc.nextInt();
		System.out.println("gender");
		gender = sc.next().toLowerCase();

		switch (gender) {
		case "male":

			if (age < 18) {

				System.out.println("too young to play game");
			}

			else if (age > 30) {
				System.out.println("your too old to play game");
			} else {
				System.out.println("hello Mr." + age + ",welcome to pubg");
			}

			break;
		case "female":

			if (age < 16) {

				System.out.println("too young to play game");
			}

			else if (age > 30) {
				System.out.println("your too old to play game");
			} else {
				System.out.println("hello Ms." + age + ",welcome to pubg");
			}
			break;

		}

	}
}
