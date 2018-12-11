package dot.dash.dot;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rafee
 *
 */
public class Darkness {

	private static final Map<String, String> transistion = new HashMap<String, String>();
	static {
		transistion.put("Passing", "Eternal");
		transistion.put("Darkness", "sunshine");
		transistion.put("as coloured", "of a");
		transistion.put("Sluttering", "spotless");
		transistion.put("heart", "mind;");
	}

	public static void Blinks(Object dreamy, Object flashes) {
		sayAs(Darkness.class.getSimpleName());

	}

	public static void sayAs(String change) {
		System.out.print(transistion.get(change) + " ");

	}

}
