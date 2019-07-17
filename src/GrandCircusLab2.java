import java.util.Scanner;

public class GrandCircusLab2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the length of the classroom.");
			double length = s.nextDouble();
			System.out.println("Enter the width of the classroom.");
			double width = s.nextDouble();
			System.out.printf("Room area: %.2f%n", area(length, width));
			System.out.printf("Room perimeter: %.2f%n", perimeter(length, width));
			System.out.println("Continue? (y/n)");
			s.nextLine(); // clear the buffer
			if (!s.nextLine().toLowerCase().equals("y")) {
				s.close();
				break;
			}
		}
	}
	
	private static double area(double width, double height) {
		return width*height;
	}
	
	private static double perimeter(double width, double height) {
		return (2*width)+(2*height);
	}
}
