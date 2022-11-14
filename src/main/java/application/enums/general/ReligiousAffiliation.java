package application.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum ReligiousAffiliation {

    ANGLICAN(1),
    CATHOLIC(2),
    PENTECOSTAL(3),
    ORTHODOX(4),
    SEVENTH_DAY_ADVENTIST(5),
    MUSLIM(6),
    OTHER(7),
    HINDU(8);

    private int value;
    private static Map<Integer, ReligiousAffiliation> map = new HashMap<>();

    private ReligiousAffiliation(int value) {
        this.value = value;
    }

    static {
        for (ReligiousAffiliation religiousAffiliation : ReligiousAffiliation.values()) {
            map.put(religiousAffiliation.value, religiousAffiliation);
        }
    }

    public static ReligiousAffiliation valueOf(int religiousAffiliation) {
        return (ReligiousAffiliation) map.get(religiousAffiliation);
    }

    public int getValue() {
        return value;
    }

}
