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

    private Effect(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    private String name;
    private String abbreviation;

    /**
     * Retrieve an Effect object by providing a matching string name
     *
     * @param name The name of the effect to return
     * @return The effect matching the input string.
     * @throws IllegalArgumentException If input string does not match existing Effect name
     */

    public Effect getEffectByNameIgnoreCase(String name) throws IllegalArgumentException {
        for(Effect effect: Effect.values()) {
            if(effect.getName().equalsIgnoreCase(name)) return effect;
        }
        throw new IllegalAccessError(String.format("Effect object with name '%s' cannot be found.", name));
    }

    /**
     * Retrieve an Effect object by providing a matching string abbreviation
     *
     * @param abbreviation The abbreviation of the effect to return
     * @return The effect matching the input string.
     * @throws IllegalArgumentException If input string does not match existing Effect abbreviation
     */

    public Effect getEffectByAbbreviationIgnoreCase(String abbreviation) throws IllegalArgumentException {
        for(Effect effect: Effect.values()) {
            if(effect.getAbbreviation().equalsIgnoreCase(abbreviation)) return effect;
        }
        throw new IllegalArgumentException(String.format("Effect object with abbreviation '%s' cannot be found.", abbreviation));
    }

    // getters and setters

    public String getName() { return name; }

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
