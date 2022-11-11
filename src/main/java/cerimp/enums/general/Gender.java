package cerimp.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum Gender {

	MALE(1),
	FEMALE(2),
	OTHER(3);

    private int value;
    private static Map<Integer, Gender> map = new HashMap<>();

    private Gender(int value) {
        this.value = value;
    }

    static {
        for (Gender gender : Gender.values()) {
            map.put(gender.value, gender);
        }
    }

    public static Gender valueOf(int gender) {
        return (Gender) map.get(gender);
    }

    public int getValue() {
        return value;
    }
    
    
}
