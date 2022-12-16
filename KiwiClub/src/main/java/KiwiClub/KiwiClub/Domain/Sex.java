package KiwiClub.KiwiClub.Domain;

import java.util.Arrays;
import java.util.List;

public enum Sex {
	FEMALE,MALE;

	public static String[] Sexes() {
		return Arrays.toString(Sex.values()).replaceAll("^.|.$", "").split(", ");
	}
}
