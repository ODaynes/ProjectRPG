package commons.components;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.List;

import static commons.Constants.EMPTY_TYPE_LIST;

public enum Type {

    // Types
    //      name                superEffectiveTo            notVeryEffectiveTo          cannotDamage        superEffectiveFrom          notVeryEffectiveFrom        immunities

    GRASS(  "Grass",    Arrays.asList(Type.WATER),  Arrays.asList(Type.FIRE),    EMPTY_TYPE_LIST,    Arrays.asList(Type.FIRE),    Arrays.asList(Type.WATER),  EMPTY_TYPE_LIST),
    FIRE(   "Fire",     Arrays.asList(Type.GRASS),  Arrays.asList(Type.WATER),   EMPTY_TYPE_LIST,    Arrays.asList(Type.WATER),   Arrays.asList(Type.GRASS),  EMPTY_TYPE_LIST),
    WATER(  "Water",    Arrays.asList(Type.FIRE),   Arrays.asList(Type.GRASS),   EMPTY_TYPE_LIST,    Arrays.asList(Type.GRASS),   Arrays.asList(Type.FIRE),   EMPTY_TYPE_LIST),
    NORMAL( "Normal",   EMPTY_TYPE_LIST,            EMPTY_TYPE_LIST,             EMPTY_TYPE_LIST,    EMPTY_TYPE_LIST,             EMPTY_TYPE_LIST,            EMPTY_TYPE_LIST);

    // Damage multipliers

    private static final double SUPER_EFFECTIVE_MULTIPLIER = 2.0;
    private static final double NOT_VERY_EFFECTIVE_MULTIPLIER = 0.5;
    private static final double IMMUNE_MULTIPLIER = 0;

    // Damage to opponents

    private List<Type> superEffectiveTo;     // 2 X Multiplier
    private List<Type> notVeryEffectiveTo;   // 0.5 X Multiplier
    private List<Type> cannotDamage;            // 0 X Multiplier

    // Damange from opponents

    private List<Type> superEffectiveFrom;     // 2 X Multiplier
    private List<Type> notVeryEffectiveFrom;   // 0.5 X Multiplier
    private List<Type> immunities;              // 0 X Multiplier

    // Descriptors

    private String name;

    // Constructors

    Type(@NotNull String name, @NotNull List<Type> superEffectiveTo, @NotNull List<Type> notVeryEffectiveTo, @NotNull List<Type> cannotDamage, @NotNull List<Type> superEffectiveFrom, @NotNull List<Type> notVeryEffectiveFrom, @NotNull List<Type> immunities) {
        this.name = name;

        this.superEffectiveTo = superEffectiveTo;
        this.notVeryEffectiveTo = notVeryEffectiveTo;
        this.cannotDamage = cannotDamage;

        this.superEffectiveFrom = superEffectiveFrom;
        this.notVeryEffectiveFrom = notVeryEffectiveFrom;
        this.immunities = immunities;
    }

    // getters and setters

    /**
     * @return List of Type enumurations which are hit super effectively by this type
     */

    List<Type> getSuperEffectiveTo() {
        return superEffectiveTo;
    }

    /**
     * Update/replace current super effective to list
     * @param superEffectiveTo New list of Type enumerations which are hit super effectively by this type
     */
    void setSuperEffectiveTo(List<Type> superEffectiveTo) {
        this.superEffectiveTo = superEffectiveTo;
    }

    /**
     * @return List of Type enumurations which resist this type
     */
    List<Type> getNotVeryEffectiveTo() {
        return notVeryEffectiveTo;
    }

    /**
     * Update/replace current not very effective to list
     * @param notVeryEffectiveTo New list of Type enumerations which resist this type
     */

    void setNotVeryEffectiveTo(List<Type> notVeryEffectiveTo) {
        this.notVeryEffectiveTo = notVeryEffectiveTo;
    }

    /**
     * @return List of Type enumurations which are immune to this type
     */

    List<Type> getCannotDamage() {
        return cannotDamage;
    }

    /**
     * Update/replace current cannotDamage list
     * @param cannotDamage New list of Type enumerations which are immune to this type
     */

    void setCannotDamage(List<Type> cannotDamage) {
        this.cannotDamage = cannotDamage;
    }

    /**
     * @return List of Type enumerations which hit this type super effectively
     */

    List<Type> getSuperEffectiveFrom() {
        return superEffectiveFrom;
    }

    /**
     * Update/replace current super effective from list
     * @param superEffectiveFrom New list of Type enumerations which hit this type super effectively
     */
    void setSuperEffectiveFrom(List<Type> superEffectiveFrom) {
        this.superEffectiveFrom = superEffectiveFrom;
    }

    /**
     * @return List of Type enumerations which are not very effective against this type
     */

    List<Type> getNotVeryEffectiveFrom() {
        return notVeryEffectiveFrom;
    }

    /**
     * Update/replace current not very effective effective from list
     * @param notVeryEffectiveFrom New list of Type enumerations which are not very effective against this type
     */

    void setNotVeryEffectiveFrom(List<Type> notVeryEffectiveFrom) {
        this.notVeryEffectiveFrom = notVeryEffectiveFrom;
    }

    /**
     * @return List of Type enumerations which do not effect this type
     */

    List<Type> getImmunities() {
        return immunities;
    }

    /**
     * Update/replace current immunities list
     * @param immunities New list of Type enumerations which do not effect this type
     */


    void setImmunities(List<Type> immunities) {
        this.immunities = immunities;
    }

    /**
     * @return Name of this type
     */

    String getName() {
        return name;
    }

    /**
     * Update/replace current name
     * @param name Name of this type
     */

    void setName(String name) {
        this.name = name;
    }
}
