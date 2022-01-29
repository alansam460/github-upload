import java.util.Scanner;
public class BiggerNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double first;
		double second;
		System.out.printf("Type in the first number%n");
		first = input.nextDouble();
		System.out.printf("Type in the second number%n");
		second = input.nextDouble();
		double max = Math.max(first, second);
		System.out.printf("%f", max);
		}
	
}
