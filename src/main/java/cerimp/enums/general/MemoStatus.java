package cerimp.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum MemoStatus {
	SENT(1),
	READ(2),
	UNREAD(3);

    private int value;
    private static Map<Integer, MemoStatus> map = new HashMap<>();

    private MemoStatus(int value) {
        this.value = value;
    }

    static {
        for (MemoStatus memoStatus : MemoStatus.values()) {
            map.put(memoStatus.value, memoStatus);
        }
    }

    public static MemoStatus valueOf(int memoStatus) {
        return (MemoStatus) map.get(memoStatus);
    }

    public int getValue() {
        return value;
    }

}
