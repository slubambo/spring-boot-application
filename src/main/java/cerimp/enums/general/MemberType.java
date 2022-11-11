package cerimp.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum MemberType {
	STAFF(1),
	NONSTAFF(2);

	private int value;
	private static Map<Integer, MemberType> map = new HashMap<>();

	private MemberType(int value) {
		this.value = value;
	}

	static {
		for (MemberType memberType : MemberType.values()) {
			map.put(memberType.value, memberType);
		}
	}

	public static MemberType valueOf(int memberType) {
		return (MemberType) map.get(memberType);
	}

	public int getValue() {
		return value;
	}
}
