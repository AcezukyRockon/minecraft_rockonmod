package com.acezuky.rockonmod.item;

import com.acezuky.rockonmod.RockonMod;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RockonMod.MOD_ID);

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",ItemBase::new);

    public static final RegistryObject<Rice> RICE = ITEMS.register("rice", Rice::new);
    public static final RegistryObject<AllEffect> ALLEFFECT = ITEMS.register("alleffect", AllEffect::new);
    public static final RegistryObject<FirstAid> FIRSTAID = ITEMS.register("firstaid", FirstAid::new);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
