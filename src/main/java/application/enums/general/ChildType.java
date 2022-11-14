package application.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum ChildType {
	BIOLOGICAL(1), // insured
	ADOPTED(2); /// not insured

	private int value;
	private static Map<Integer, ChildType> map = new HashMap<>();

	private ChildType(int value) {
		this.value = value;
	}

	static {
		for (ChildType childType : ChildType.values()) {
			map.put(childType.value, childType);
		}
	}

	public static ChildType valueOf(int childType) {
		return (ChildType) map.get(childType);
	}

	public int getValue() {
		return value;
	}
}
