package cerimp.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum FileType {
	HR(0),
	MEMO(1),
	MARRIAGE(2),
	BIRTH(3);

	private int value;
	private static Map<Integer, FileType> map = new HashMap<>();

	private FileType(int value) {
		this.value = value;
	}

	static {
		for (FileType fileType : FileType.values()) {
			map.put(fileType.value, fileType);
		}
	}

	public static FileType valueOf(int fileType) {
		return (FileType) map.get(fileType);
	}

	public int getValue() {
		return value;
	}
}
