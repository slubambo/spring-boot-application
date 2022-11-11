package cerimp.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum KinRelationshipType {
    FATHER(1),
    MOTHER(2),
    UNCLE(3),
    AUNT(4),
    BROTHER(5),
    GUARDIAN(6),
    SPOUSE(7),
    CHILD(8),
    FRIEND(9),
    SISTER(10),
    OTHER(11);

    private int value;
    private static Map<Integer, KinRelationshipType> map = new HashMap<>();

    private KinRelationshipType(int value) {
        this.value = value;
    }

    static {
        for (KinRelationshipType kinRelationshipType : KinRelationshipType.values()) {
            map.put(kinRelationshipType.value, kinRelationshipType);
        }
    }

    public static KinRelationshipType valueOf(int kinRelationshipType) {
        return (KinRelationshipType) map.get(kinRelationshipType);
    }

    public int getValue() {
        return value;
    }

}
