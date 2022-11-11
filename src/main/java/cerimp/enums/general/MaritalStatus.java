package cerimp.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum MaritalStatus {
	SINGLE(0),
	MARRIED(1),
	DIVORCED(2),
	WIDOWED (3),
	SEPARATED (4);
	
    private int value;
    private static Map<Integer, MaritalStatus> map = new HashMap<>();

    private MaritalStatus(int value) {
        this.value = value;
    }

    static {
        for (MaritalStatus maritalStatus : MaritalStatus.values()) {
            map.put(maritalStatus.value, maritalStatus);
        }
    }

    public static MaritalStatus valueOf(int maritalStatus) {
        return (MaritalStatus) map.get(maritalStatus);
    }

    public int getValue() {
        return value;

}

}
