package commons.components;

/**
 * Created by Owen Daynes on 14/07/2019.
 */
public enum Effect {

    NONE("None", "NON"),
    BURN("Burn", "BRN"),
    PARALYSIS("Paralysis", "PAR"),
    FREEZE("Freeze", "FRZ"),
    POISON("Poison", "PSN"),
    SLEEP("Sleep", "SLP"),
    CONFUSED("Confused", "CON");

    Effect(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    private String name;
    private String abbreviation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
