package application.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum MarriageType {
	CUSTOMARY(1),
	CHURCH(2),
	CIVIL(3),
	OTHER(4);

	private int value;
	private static Map<Integer, MarriageType> map = new HashMap<>();

	private MarriageType(int value) {
		this.value = value;
	}

	static {
		for (MarriageType marriageType : MarriageType.values()) {
			map.put(marriageType.value, marriageType);
		}
	}

	public static MarriageType valueOf(int marriageType) {
		return (MarriageType) map.get(marriageType);
	}

	public int getValue() {
		return value;
	}

}
