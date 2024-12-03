package com.warden.sculkmod.item;

import com.warden.sculkmod.SculkMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class moditems {
    public static final Item SOUL_GEM = registerItem("soul_gem", new Item(new Item.Settings()));
    public static final Item FRACTURED_SOUL_GEM = registerItem("fractured_soul_gem", new Item(new Item.Settings()));

private  static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(SculkMod.MOD_ID, name), item);
}

    public static void registermoditems()  {
        SculkMod.LOGGER.info("Registering mod items for " + SculkMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SOUL_GEM);
            entries.add(FRACTURED_SOUL_GEM);
        });
    }
}
