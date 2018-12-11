package he.disappeared.words.stammered;

import java.util.ArrayList;
import java.util.List;

import broken.tongue.letters.scattered.Talking;
import dot.dash.dot.Darkness;

public class Sluttering {

	public static final String sparklingLight = ".... --- .--     .... .- .--. .--. -.--     .. ...     - .... .     -... .-.. .- -- . .-.. . ... ...     ...- . ... - .- .-.. ...     .-.. --- - -·-·-- -.-.--";
	public static final String fromBefore = "- .... .     .-- --- .-. .-.. -..     ..-. --- .-. --. . - - .. -. --. --··--     -... -.--     - .... .     .-- --- .-. .-.. -..     ..-. --- .-. --. --- - ·-·-·- .-.-.-";

	public static void heart(String blinds) {

		System.out.println();
		System.out.print("\t\t\t\t");
		Darkness.sayAs(Sluttering.class.getSimpleName());
		Darkness.sayAs(new Object() {
		}.getClass().getEnclosingMethod().getName());
		System.out.println();
		System.out.println();

		for (String line : textLimiter(blinds, 80)) {
			System.out.println(line);
		}

		System.out.println();
		System.out.println(Talking.decode(sparklingLight));
		System.out.println(" " + Talking.decode(fromBefore));

	}

	private static List<String> textLimiter(String input, int limit) {
		List<String> returnList = new ArrayList<>();
		String[] parts = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String part : parts) {
			if (sb.length() + part.length() > limit) {
				returnList.add(sb.toString().substring(0, sb.toString().length() - 1));
				sb = new StringBuilder();
			}
			sb.append(part + " ");
		}
		if (sb.length() > 0) {
			returnList.add(sb.toString());
		}
		return returnList;
	}

}
