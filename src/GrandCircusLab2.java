import java.util.Scanner;

public class GrandCircusLab2 {
	public static void main(String[] args) {
		var s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the length of the classroom.");
			var length = s.nextDouble();
			System.out.println("Enter the width of the classroom.");
			var width = s.nextDouble();
			System.out.println("Room area: " + area(length, width));
			System.out.println("Room perimeter: " + perimeter(length, width));
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
