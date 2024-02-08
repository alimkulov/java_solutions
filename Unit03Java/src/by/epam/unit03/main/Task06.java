package by.epam.unit03.main;

public class Task06 {

	public static void main(String[] args) {
		int x = 12345;
		int y = 73251;
		int xd, yd, temp;

		System.out.println("x=" + x);
		System.out.println("y=" + y);

		temp = y;

		while (x > 0) {
			xd = x % 10;

			y = temp;
			while (y > 0) {
				yd = y % 10;
				if (yd == xd) {
					System.out.println(yd);
				}
				y /= 10;
			}

			x /= 10;

		}

	}

}
