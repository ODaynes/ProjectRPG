package commons.components;

import com.sun.istack.internal.NotNull;

/**
 * Created by Owen Daynes on 11/07/2019.
 */
public enum Move {

    TACKLE("Tackle", "The fighter tackles the opponent with their full force.", 50, Type.NORMAL, Effect.NONE, 0),
    VINE_WHIP("Vine Whip", "The fighter whips the opponent with a vine.", 40, Type.GRASS, Effect.NONE, 0),
    EMBER("Ember", "The fighter burns the opponent with a small flame.", 40, Type.FIRE, Effect.BURN, 5),
    WATER_GUN("Water Gun", "The fighter hits the opponent with a small jet of water.", 40, Type.WATER, Effect.NONE, 0);

    private String name;
    private String desc;
    private Integer power;
    private Type type;
    private Effect effect;
    private Integer effectChance; // 0 - 100, representing 0% - 100%

    Move(@NotNull String name, @NotNull String desc, @NotNull Integer power, @NotNull Type type, @NotNull Effect effect, @NotNull Integer effectChance) {
        this.name = name;
        this.desc = desc;
        this.power = power;
        this.type = type;
        this.effect = effect;

        // If there is no effect, no point in calculating whether effect occurs
        if(effect != Effect.NONE) {
            this.effectChance = effectChance;
        } else {
            this.effectChance = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public Integer getEffectChance() {
        return effectChance;
    }

    public void setEffectChance(Integer effectChance) {
        this.effectChance = effectChance;
    }
}
