package commons.components;

import com.sun.istack.internal.NotNull;

/**
 * Created by Owen Daynes on 11/07/2019.
 */
public enum Move {

    TACKLE("Tackle", "The fighter tackles the opponent with their full force.", 50, Type.NORMAL),
    VINE_WHIP("Vine Whip", "The fighter whips the opponent with a vine.", 40, Type.GRASS),
    EMBER("Ember", "The fighter burns the opponent with a small flame.", 40, Type.FIRE),
    WATER_GUN("Water Gun", "The fighter hits the opponent with a small jet of water.", 40, Type.WATER);

    private String name;
    private String desc;
    private Integer power;
    private Type type;

    Move(@NotNull String name, @NotNull String desc, @NotNull Integer power, @NotNull Type type) {
        this.name = name;
        this.desc = desc;
        this.power = power;
        this.type = type;
    }
}
