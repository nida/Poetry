
package dot.dash.dot;

public class Waves {

	private static String fullName = "";

	public static String blind() {
		String blinds = ".... --- .--     .... .- .--. .--. -.--     .. ...     - .... .     -... .-.. .- -- . .-.. . ... ...     ...- . ... - .- .-.. ...     .-.. --- - -·-·-- - .... .     .-- --- .-. .-.. -..     ..-. --- .-. --. . - - .. -. --. --··--     -... -.--     - .... .     .-- --- .-. .-.. -..     ..-. --- .-. --. --- - ·-·-·-";
		return blinds;

	}

	public static int allMyFears() {
		Darkness.sayAs(fullName.trim());
		// System.out.println(fullName);
		return "fullName".length();
	}

	private static void appendString(String string) {
		fullName = string + fullName;
		// System.out.println(fullName);
	}

	public static int FallingTears() {

		appendString("coloured ");
		return "coloured".length();
	}

	public static int as(int i) {
		String name = new Object() {
		}.getClass().getEnclosingMethod().getName();
		appendString(name + " ");
		int input = 1;
		for (int number = 0; number < input; number++) {
			System.out.println("");
			// print spaces equal to the number variable
			for (int count = 0; count < number + 21; count++) {
				System.out.print(" ");
			}

			System.out.print(" ");
		}
		return input;
	}

	public static String signals(String blinds) {
		return blinds;
	}

}
