package compute;

import java.util.Scanner;

public class Mul implements Compute {

	private int x, y;

	public Mul() {
		Scanner scan = new Scanner(System.in);

		System.out.print("x값입력:");
		x = scan.nextInt();
		System.out.print("y값입력:");
		y = scan.nextInt();

	}

	@Override
	public void execute() {
		System.out.println(x + " * " + y + " = " + (x * y));
	}

}