package KiwiClub.KiwiClub.Domain;

import java.util.Arrays;

public enum KiwiSpecies {
	NORMAL,DOTTED;
	public static String[] Species() {
		return Arrays.toString(KiwiSpecies.values()).replaceAll("^.|.$", "").split(", ");
	}
}
