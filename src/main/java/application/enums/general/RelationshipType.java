package application.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum RelationshipType {
    NEXT_OF_KIN(1),
    REFEREE(2),
    CHILD(3),
    FATHER(4),
    MOTHER(5),
    GUARDIAN(6),
    SPOUSE(7),
    UNCLE(8),
    AUNT(9),
    SPONSOR(10);

    private int value;
    private static Map<Integer, RelationshipType> map = new HashMap<>();

    private RelationshipType(int value) {
        this.value = value;
    }

    static {
        for (RelationshipType relationshipType : RelationshipType.values()) {
            map.put(relationshipType.value, relationshipType);
        }
    }

    public static RelationshipType valueOf(int relationshipType) {
        return (RelationshipType) map.get(relationshipType);
    }

    public int getValue() {
        return value;
    }
}
