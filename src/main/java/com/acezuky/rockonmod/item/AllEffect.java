package com.acezuky.rockonmod.item;

import com.acezuky.rockonmod.RockonMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class AllEffect extends Item {
    public AllEffect(){
        super(new Item.Properties()
                .tab(RockonMod.TAB)
                .food(new Food.Builder()
                        .alwaysEat()
                        .effect(new EffectInstance(Effects.ABSORPTION,100,1),1)
                        .effect(new EffectInstance(Effects.BAD_OMEN,100,1),1)
                        .effect(new EffectInstance(Effects.BLINDNESS,100,1),1)
                        .effect(new EffectInstance(Effects.CONDUIT_POWER,100,1),1)
                        .effect(new EffectInstance(Effects.DOLPHINS_GRACE,100,1),1)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE,100,1),1)
                        .effect(new EffectInstance(Effects.GLOWING,100,1),1)
                        .effect(new EffectInstance(Effects.DIG_SPEED,100,1),1)
                        .effect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE,100,1),1)
                        .effect(new EffectInstance(Effects.HUNGER,100,1),1)
                        .effect(new EffectInstance(Effects.INVISIBILITY,100,1),1)
                        .effect(new EffectInstance(Effects.JUMP,100,1),1)
                        .effect(new EffectInstance(Effects.LEVITATION,100,1),1)
                        .effect(new EffectInstance(Effects.DIG_SPEED,100,1),1)
                        .effect(new EffectInstance(Effects.CONFUSION,100,1),1)
                        .effect(new EffectInstance(Effects.NIGHT_VISION,100,1),1)
                        .effect(new EffectInstance(Effects.POISON,100,1),1)
                        .effect(new EffectInstance(Effects.REGENERATION,100,1),1)
                        .effect(new EffectInstance(Effects.DAMAGE_RESISTANCE,100,1),1)
                        .effect(new EffectInstance(Effects.SLOW_FALLING,100,1),1)
                        .effect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN,100,1),1)
                        .effect(new EffectInstance(Effects.MOVEMENT_SPEED,100,1),1)
                        .effect(new EffectInstance(Effects.DAMAGE_BOOST,100,1),1)
                        .effect(new EffectInstance(Effects.WATER_BREATHING,100,1),1)
                        .effect(new EffectInstance(Effects.WEAKNESS,100,1),1)
                        .effect(new EffectInstance(Effects.WITHER,100,1),1)
                        .build())
        );
    }
}
