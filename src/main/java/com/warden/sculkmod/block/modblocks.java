package com.warden.sculkmod.block;

import com.warden.sculkmod.SculkMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;

@SuppressWarnings("ALL")
public class modblocks {

    public static final Block DEEP_WOOD_log = registerBlock( "deep_wood_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0f, 2.0f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_WOOD).burnable()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SculkMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SculkMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));


    }
    public static void registermodblocks() {
        SculkMod.LOGGER.info("Registering Mod Blocks for "+ SculkMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(modblocks.DEEP_WOOD_log);
        });
    }
}
