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
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_2 = registerBlock("slow_feeder_bagek_2",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_3 = registerBlock("slow_feeder_bagek_3",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_4 = registerBlock("slow_feeder_bagek_4",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_5 = registerBlock("slow_feeder_bagek_5",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_6 = registerBlock("slow_feeder_bagek_6",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_7 = registerBlock("slow_feeder_bagek_7",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_8 = registerBlock("slow_feeder_bagek_8",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_9 = registerBlock("slow_feeder_bagek_9",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_10 = registerBlock("slow_feeder_bagek_10",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_11 = registerBlock("slow_feeder_bagek_11",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_12 = registerBlock("slow_feeder_bagek_12",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_13 = registerBlock("slow_feeder_bagek_13",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_14 = registerBlock("slow_feeder_bagek_14",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_15 = registerBlock("slow_feeder_bagek_15",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_16 = registerBlock("slow_feeder_bagek_16",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_17 = registerBlock("slow_feeder_bagek_17",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_18 = registerBlock("slow_feeder_bagek_18",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_19 = registerBlock("slow_feeder_bagek_19",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_20 = registerBlock("slow_feeder_bagek_20",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_21 = registerBlock("slow_feeder_bagek_21",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_22 = registerBlock("slow_feeder_bagek_22",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_23 = registerBlock("slow_feeder_bagek_23",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_24 = registerBlock("slow_feeder_bagek_24",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_25 = registerBlock("slow_feeder_bagek_25",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_26 = registerBlock("slow_feeder_bagek_26",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_27 = registerBlock("slow_feeder_bagek_27",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<SlowFeederBlock> SLOW_FEEDER_BAGEK_28 = registerBlock("slow_feeder_bagek_28",
            () -> new SlowFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);



    // GRAIN FEEDERS
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_1 = registerBlock("grain_feeder_bagek_1",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_2 = registerBlock("grain_feeder_bagek_2",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_3 = registerBlock("grain_feeder_bagek_3",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_4 = registerBlock("grain_feeder_bagek_4",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_5 = registerBlock("grain_feeder_bagek_5",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_6 = registerBlock("grain_feeder_bagek_6",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_7 = registerBlock("grain_feeder_bagek_7",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_8 = registerBlock("grain_feeder_bagek_8",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_9 = registerBlock("grain_feeder_bagek_9",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_10 = registerBlock("grain_feeder_bagek_10",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_11 = registerBlock("grain_feeder_bagek_11",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_12 = registerBlock("grain_feeder_bagek_12",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_13 = registerBlock("grain_feeder_bagek_13",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_14 = registerBlock("grain_feeder_bagek_14",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_15 = registerBlock("grain_feeder_bagek_15",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_16 = registerBlock("grain_feeder_bagek_16",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_17 = registerBlock("grain_feeder_bagek_17",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_18 = registerBlock("grain_feeder_bagek_18",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_19 = registerBlock("grain_feeder_bagek_19",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_20 = registerBlock("grain_feeder_bagek_20",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_21 = registerBlock("grain_feeder_bagek_21",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_22 = registerBlock("grain_feeder_bagek_22",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_23 = registerBlock("grain_feeder_bagek_23",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_24 = registerBlock("grain_feeder_bagek_24",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_25 = registerBlock("grain_feeder_bagek_25",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_26 = registerBlock("grain_feeder_bagek_26",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_27 = registerBlock("grain_feeder_bagek_27",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainFeederBlock> GRAIN_FEEDER_BAGEK_28 = registerBlock("grain_feeder_bagek_28",
            () -> new GrainFeederBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), null),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);


    // GRAIN BINS
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_1 = registerBlock("bin_grain_bagek_1",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_2 = registerBlock("bin_grain_bagek_2",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_3 = registerBlock("bin_grain_bagek_3",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_4 = registerBlock("bin_grain_bagek_4",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_5 = registerBlock("bin_grain_bagek_5",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_6 = registerBlock("bin_grain_bagek_6",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_7 = registerBlock("bin_grain_bagek_7",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_8 = registerBlock("bin_grain_bagek_8",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_9 = registerBlock("bin_grain_bagek_9",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_10 = registerBlock("bin_grain_bagek_10",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_11 = registerBlock("bin_grain_bagek_11",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_12 = registerBlock("bin_grain_bagek_12",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_13 = registerBlock("bin_grain_bagek_13",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_14 = registerBlock("bin_grain_bagek_14",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_15 = registerBlock("bin_grain_bagek_15",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_16 = registerBlock("bin_grain_bagek_16",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_17 = registerBlock("bin_grain_bagek_17",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_18 = registerBlock("bin_grain_bagek_18",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_19 = registerBlock("bin_grain_bagek_19",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_20 = registerBlock("bin_grain_bagek_20",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_21 = registerBlock("bin_grain_bagek_21",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_22 = registerBlock("bin_grain_bagek_22",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_23 = registerBlock("bin_grain_bagek_23",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_24 = registerBlock("bin_grain_bagek_24",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_25 = registerBlock("bin_grain_bagek_25",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_26 = registerBlock("bin_grain_bagek_26",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_27 = registerBlock("bin_grain_bagek_27",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<GrainBinBlock> BIN_GRAIN_BAGEK_28 = registerBlock("bin_grain_bagek_28",
            () -> new GrainBinBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.METAL).strength(2.0F, 3.0F).requiresCorrectToolForDrops()),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);


    // TACK BOXES
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_1 = registerBlock("tack_box_bagek_1",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_2 = registerBlock("tack_box_bagek_2",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_3 = registerBlock("tack_box_bagek_3",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_4 = registerBlock("tack_box_bagek_4",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_5 = registerBlock("tack_box_bagek_5",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_6 = registerBlock("tack_box_bagek_6",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_7 = registerBlock("tack_box_bagek_7",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_8 = registerBlock("tack_box_bagek_8",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_9 = registerBlock("tack_box_bagek_9",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_10 = registerBlock("tack_box_bagek_10",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_11 = registerBlock("tack_box_bagek_11",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_12 = registerBlock("tack_box_bagek_12",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_13 = registerBlock("tack_box_bagek_13",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_14 = registerBlock("tack_box_bagek_14",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_15 = registerBlock("tack_box_bagek_15",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_16 = registerBlock("tack_box_bagek_16",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_17 = registerBlock("tack_box_bagek_17",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_18 = registerBlock("tack_box_bagek_18",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_19 = registerBlock("tack_box_bagek_19",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_20 = registerBlock("tack_box_bagek_20",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_21 = registerBlock("tack_box_bagek_21",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_22 = registerBlock("tack_box_bagek_22",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_23 = registerBlock("tack_box_bagek_23",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_24 = registerBlock("tack_box_bagek_24",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_25 = registerBlock("tack_box_bagek_25",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_26 = registerBlock("tack_box_bagek_26",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_27 = registerBlock("tack_box_bagek_27",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
            BageksAddonCreativeModeTab.BAGEKSBLOCK_TAB);
    public static final RegistryObject<TackBoxBlock> TACK_BOX_BAGEK_28 = registerBlock("tack_box_bagek_28",
            () -> new TackBoxBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .sound(SoundType.WOOD).strength(2.0F, 3.0F).requiresCorrectToolForDrops(), 1),
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
