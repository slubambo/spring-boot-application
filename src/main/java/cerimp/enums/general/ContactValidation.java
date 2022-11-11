package cerimp.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum ContactValidation {
    PHONE(1),
    EMAIL(2);

    private int value;
    private static Map<Integer, ContactValidation> map = new HashMap<>();

    private ContactValidation(int value) {
        this.value = value;
    }

    static {
        for (ContactValidation contactValidation : ContactValidation.values()) {
            map.put(contactValidation.value, contactValidation);
        }
    }

    public static ContactValidation valueOf(int contactValidation) {
        return (ContactValidation) map.get(contactValidation);
    }

    public int getValue() {
        return value;

    }

}
