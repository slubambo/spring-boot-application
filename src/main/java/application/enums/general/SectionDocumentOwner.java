package application.enums.general;

import java.util.HashMap;
import java.util.Map;

public enum SectionDocumentOwner {

    PERSONAL_FILES(1),
    NO_DEFINED(2);

    private int value;
    private static Map<Integer, SectionDocumentOwner> map = new HashMap<>();

    private SectionDocumentOwner(int value) {
        this.value = value;
    }

    static {
        for (SectionDocumentOwner sectionDocumentOwner : SectionDocumentOwner.values()) {
            map.put(sectionDocumentOwner.value, sectionDocumentOwner);
        }
    }

    public static SectionDocumentOwner valueOf(int sectionDocumentOwner) {
        return (SectionDocumentOwner) map.get(sectionDocumentOwner);
    }

    public int getValue() {
        return value;
    }

}
