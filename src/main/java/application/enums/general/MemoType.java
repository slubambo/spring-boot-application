package application.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum MemoType {

    NORMAL(1),
    REPLY(2),
    FORWARDED(3),
    BROADCAST(4);

    private int value;
    private static Map<Integer, MemoType> map = new HashMap<>();

    private MemoType(int value) {
        this.value = value;
    }

    static {
        for (MemoType memoType : MemoType.values()) {
            map.put(memoType.value, memoType);
        }
    }

    public static MemoType valueOf(int memoActions) {
        return (MemoType) map.get(memoActions);
    }

    public int getValue() {
        return value;
    }

}
