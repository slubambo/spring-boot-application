package cerimp.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum MemoArchive {
	ARCHIVE(1), UNARCHIVE(2), DELETE(3);

	private int value;
	private static Map<Integer, MemoArchive> map = new HashMap<>();

	private MemoArchive(int value) {
		this.value = value;
	}

	static {
		for (MemoArchive memoArchive : MemoArchive.values()) {
			map.put(memoArchive.value, memoArchive);
		}
	}

	public static MemoArchive valueOf(int memoArchive) {
		return (MemoArchive) map.get(memoArchive);
	}

	public int getValue() {
		return value;
	}

}
