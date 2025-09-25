package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.blocks.*;
import com.coqire.bageksequineyaddon.Bageksequineyaddon;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModeTab;
import com.coqire.bageksequineyaddon.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BagekBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Bageksequineyaddon.Mod_ID);

    // SLOW FEEDERS
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_1 = registerBlock("slow_feeder_bagek_1",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);


    // GRAIN FEEDERS
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_1 = registerBlock("grain_feeder_bagek_1",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);


    // GRAIN BINS
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_1 = registerBlock("bin_grain_bagek_1",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);


    // TACK BOXES
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_1 = registerBlock("tack_box_bagek_1",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);


    // HALF BARRELS
    public static final RegistryObject<HalfBarrelBlock> HALF_BARREL_BAGEK_1 = registerBlock("half_barrel_bagek_1",
            () -> new HalfBarrelBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return BageksTack.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
