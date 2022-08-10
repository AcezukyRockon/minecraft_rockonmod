package com.acezuky.rockonmod.item;

import com.acezuky.rockonmod.RockonMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;

import java.util.function.Supplier;

public class RockonFood extends Item {
    public RockonFood() {
        super(new Item.Properties()
                .tab(RockonMod.TAB)
                .food(new Food.Builder()
                        .alwaysEat()
                        .nutrition(2)
                        .saturationMod(1.2f)
                        .effect(new EffectInstance(Effects.SATURATION, 400,1),1)
                        .build())
        );
    }
}
