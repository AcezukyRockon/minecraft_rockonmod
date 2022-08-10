package com.acezuky.rockonmod.item;

import com.acezuky.rockonmod.RockonMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FirstAid extends Item {
    public FirstAid() {
        super(new Item.Properties()
                .tab(RockonMod.TAB)
                .food(new Food.Builder()
                        .alwaysEat()
                        .effect(new EffectInstance(Effects.REGENERATION,200,1),1)
                        .build())
        );
    }
}
