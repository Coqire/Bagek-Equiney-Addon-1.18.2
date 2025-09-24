package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.blocks.SlowFeederBlock;
import com.alaharranhonor.swem.forge.items.tack.*;
import com.coqire.bageksequineyaddon.Bageksequineyaddon;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BageksMainTack {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bageksequineyaddon.Mod_ID);

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_BAGEK_1 = ITEMS.register("english_saddle_bagek_1",
            () -> new EnglishSaddleItem("english_saddle_bagek_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_BAGEK_2 = ITEMS.register("english_saddle_bagek_2",
            () -> new EnglishSaddleItem("english_saddle_bagek_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_BAGEK_3 = ITEMS.register("english_saddle_bagek_3",
            () -> new EnglishSaddleItem("english_saddle_bagek_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishSaddleItem> ENGLISH_SADDLE_BAGEK_4 = ITEMS.register("english_saddle_bagek_4",
            () -> new EnglishSaddleItem("english_saddle_bagek_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_BAGEK_RACING_1 = ITEMS.register("western_saddle_bagek_racing_1",
            () -> new WesternSaddleItem("western_saddle_bagek_racing_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_BAGEK_RACING_2 = ITEMS.register("western_saddle_bagek_racing_2",
            () -> new WesternSaddleItem("western_saddle_bagek_racing_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_BAGEK_1 = ITEMS.register("western_saddle_bagek_1",
            () -> new WesternSaddleItem("western_saddle_bagek_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_BAGEK_2 = ITEMS.register("western_saddle_bagek_2",
            () -> new WesternSaddleItem("western_saddle_bagek_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_BAGEK_3 = ITEMS.register("western_saddle_bagek_3",
            () -> new WesternSaddleItem("western_saddle_bagek_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternSaddleItem> WESTERN_SADDLE_BAGEK_4 = ITEMS.register("western_saddle_bagek_4",
            () -> new WesternSaddleItem("western_saddle_bagek_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DB_1 = ITEMS.register("english_bridle_bagek_db_1",
            () -> new EnglishBridleItem("english_bridle_bagek_db_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DB_2 = ITEMS.register("english_bridle_bagek_db_2",
            () -> new EnglishBridleItem("english_bridle_bagek_db_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DB_3 = ITEMS.register("english_bridle_bagek_db_3",
            () -> new EnglishBridleItem("english_bridle_bagek_db_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DB_4 = ITEMS.register("english_bridle_bagek_db_4",
            () -> new EnglishBridleItem("english_bridle_bagek_db_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_1 = ITEMS.register("english_bridle_bagek_db_fluffy_1",
            () -> new EnglishBridleItem("english_bridle_bagek_db_fluffy_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_2 = ITEMS.register("english_bridle_bagek_db_fluffy_2",
            () -> new EnglishBridleItem("english_bridle_bagek_db_fluffy_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_3 = ITEMS.register("english_bridle_bagek_db_fluffy_3",
            () -> new EnglishBridleItem("english_bridle_bagek_db_fluffy_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DB_FLUFFY_4 = ITEMS.register("english_bridle_bagek_db_fluffy_4",
            () -> new EnglishBridleItem("english_bridle_bagek_db_fluffy_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_FSH_1 = ITEMS.register("english_bridle_bagek_fsh_1",
            () -> new EnglishBridleItem("english_bridle_bagek_fsh_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_FSH_2 = ITEMS.register("english_bridle_bagek_fsh_2",
            () -> new EnglishBridleItem("english_bridle_bagek_fsh_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_FSH_3 = ITEMS.register("english_bridle_bagek_fsh_3",
            () -> new EnglishBridleItem("english_bridle_bagek_fsh_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_FSH_4 = ITEMS.register("english_bridle_bagek_fsh_4",
            () -> new EnglishBridleItem("english_bridle_bagek_fsh_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_SPLITR_1 = ITEMS.register("english_bridle_bagek_splitr_1",
            () -> new EnglishBridleItem("english_bridle_bagek_splitr_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_SPLITR_2 = ITEMS.register("english_bridle_bagek_splitr_2",
            () -> new EnglishBridleItem("english_bridle_bagek_splitr_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_SPLITR_3 = ITEMS.register("english_bridle_bagek_splitr_3",
            () -> new EnglishBridleItem("english_bridle_bagek_splitr_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_SPLITR_4 = ITEMS.register("english_bridle_bagek_splitr_4",
            () -> new EnglishBridleItem("english_bridle_bagek_splitr_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DROP_1 = ITEMS.register("english_bridle_bagek_drop_1",
            () -> new EnglishBridleItem("english_bridle_bagek_drop_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DROP_2 = ITEMS.register("english_bridle_bagek_drop_2",
            () -> new EnglishBridleItem("english_bridle_bagek_drop_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DROP_3 = ITEMS.register("english_bridle_bagek_drop_3",
            () -> new EnglishBridleItem("english_bridle_bagek_drop_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_DROP_4 = ITEMS.register("english_bridle_bagek_drop_4",
            () -> new EnglishBridleItem("english_bridle_bagek_drop_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_XC_1 = ITEMS.register("english_bridle_bagek_xc_1",
            () -> new EnglishBridleItem("english_bridle_bagek_xc_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_XC_2 = ITEMS.register("english_bridle_bagek_xc_2",
            () -> new EnglishBridleItem("english_bridle_bagek_xc_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_XC_3 = ITEMS.register("english_bridle_bagek_xc_3",
            () -> new EnglishBridleItem("english_bridle_bagek_xc_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_XC_4 = ITEMS.register("english_bridle_bagek_xc_4",
            () -> new EnglishBridleItem("english_bridle_bagek_xc_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_1 = ITEMS.register("english_bridle_bagek_xc_fluffy_1",
            () -> new EnglishBridleItem("english_bridle_bagek_xc_fluffy_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_2 = ITEMS.register("english_bridle_bagek_xc_fluffy_2",
            () -> new EnglishBridleItem("english_bridle_bagek_xc_fluffy_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_3 = ITEMS.register("english_bridle_bagek_xc_fluffy_3",
            () -> new EnglishBridleItem("english_bridle_bagek_xc_fluffy_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBridleItem> ENGLISH_BRIDLE_BAGEK_XC_FLUFFY_4 = ITEMS.register("english_bridle_bagek_xc_fluffy_4",
            () -> new EnglishBridleItem("english_bridle_bagek_xc_fluffy_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_BAGEK_1 = ITEMS.register("western_bridle_bagek_1",
            () -> new WesternBridleItem("western_bridle_bagek_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_BAGEK_2 = ITEMS.register("western_bridle_bagek_2",
            () -> new WesternBridleItem("western_bridle_bagek_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_BAGEK_3 = ITEMS.register("western_bridle_bagek_3",
            () -> new WesternBridleItem("western_bridle_bagek_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_BAGEK_4 = ITEMS.register("western_bridle_bagek_4",
            () -> new WesternBridleItem("western_bridle_bagek_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_BAGEK_FLUFFY_1 = ITEMS.register("western_bridle_bagek_fluffy_1",
            () -> new WesternBridleItem("western_bridle_bagek_fluffy_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_BAGEK_FLUFFY_2 = ITEMS.register("western_bridle_bagek_fluffy_2",
            () -> new WesternBridleItem("western_bridle_bagek_fluffy_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_BAGEK_FLUFFY_3 = ITEMS.register("western_bridle_bagek_fluffy_3",
            () -> new WesternBridleItem("western_bridle_bagek_fluffy_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternBridleItem> WESTERN_BRIDLE_BAGEK_FLUFFY_4 = ITEMS.register("western_bridle_bagek_fluffy_4",
            () -> new WesternBridleItem("western_bridle_bagek_fluffy_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_1 = ITEMS.register("english_girth_strap_bagek_1",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_2 = ITEMS.register("english_girth_strap_bagek_2",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_3 = ITEMS.register("english_girth_strap_bagek_3",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_4 = ITEMS.register("english_girth_strap_bagek_4",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_1 = ITEMS.register("english_girth_strap_bagek_fluffy_1",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_fluffy_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_2 = ITEMS.register("english_girth_strap_bagek_fluffy_2",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_fluffy_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_3 = ITEMS.register("english_girth_strap_bagek_fluffy_3",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_fluffy_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_FLUFFY_4 = ITEMS.register("english_girth_strap_bagek_fluffy_4",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_fluffy_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_RACING_1 = ITEMS.register("english_girth_strap_bagek_racing_1",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_racing_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_RACING_2 = ITEMS.register("english_girth_strap_bagek_racing_2",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_racing_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_BAGEK_1 = ITEMS.register("western_girth_strap_bagek_1",
            () -> new WesternGirthStrapItem("western_girth_strap_bagek_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_BAGEK_2 = ITEMS.register("western_girth_strap_bagek_2",
            () -> new WesternGirthStrapItem("western_girth_strap_bagek_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_BAGEK_3 = ITEMS.register("western_girth_strap_bagek_3",
            () -> new WesternGirthStrapItem("western_girth_strap_bagek_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_BAGEK_4 = ITEMS.register("western_girth_strap_bagek_4",
            () -> new WesternGirthStrapItem("western_girth_strap_bagek_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_1 = ITEMS.register("western_girth_strap_bagek_fluffy_1",
            () -> new WesternGirthStrapItem("western_girth_strap_bagek_fluffy_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_2 = ITEMS.register("western_girth_strap_bagek_fluffy_2",
            () -> new WesternGirthStrapItem("western_girth_strap_bagek_fluffy_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_3 = ITEMS.register("western_girth_strap_bagek_fluffy_3",
            () -> new WesternGirthStrapItem("western_girth_strap_bagek_fluffy_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternGirthStrapItem> WESTERN_GIRTH_STRAP_BAGEK_FLUFFY_4 = ITEMS.register("western_girth_strap_bagek_fluffy_4",
            () -> new WesternGirthStrapItem("western_girth_strap_bagek_fluffy_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_1 = ITEMS.register("english_girth_strap_bagek_jumping_1",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_jumping_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_2 = ITEMS.register("english_girth_strap_bagek_jumping_2",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_jumping_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_3 = ITEMS.register("english_girth_strap_bagek_jumping_3",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_jumping_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_4 = ITEMS.register("english_girth_strap_bagek_jumping_4",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_jumping_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_1 = ITEMS.register("english_girth_strap_bagek_jumping_fluffy_1",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_jumping_fluffy_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_2 = ITEMS.register("english_girth_strap_bagek_jumping_fluffy_2",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_jumping_fluffy_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_3 = ITEMS.register("english_girth_strap_bagek_jumping_fluffy_3",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_jumping_fluffy_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishGirthStrap> ENGLISH_GIRTH_STRAP_BAGEK_JUMPING_FLUFFY_4 = ITEMS.register("english_girth_strap_bagek_jumping_fluffy_4",
            () -> new EnglishGirthStrap("english_girth_strap_bagek_jumping_fluffy_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_1 = ITEMS.register("english_breast_collar_bagek_1",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_2 = ITEMS.register("english_breast_collar_bagek_2",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_3 = ITEMS.register("english_breast_collar_bagek_3",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_4 = ITEMS.register("english_breast_collar_bagek_4",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_FIVEPOINT_1 = ITEMS.register("english_breast_collar_bagek_fivepoint_1",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_fivepoint_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_FIVEPOINT_2 = ITEMS.register("english_breast_collar_bagek_fivepoint_2",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_fivepoint_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_FIVEPOINT_3 = ITEMS.register("english_breast_collar_bagek_fivepoint_3",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_fivepoint_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_FIVEPOINT_4 = ITEMS.register("english_breast_collar_bagek_fivepoint_4",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_fivepoint_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_XC_1 = ITEMS.register("english_breast_collar_bagek_xc_1",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_xc_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_XC_2 = ITEMS.register("english_breast_collar_bagek_xc_2",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_xc_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_XC_3 = ITEMS.register("english_breast_collar_bagek_xc_3",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_xc_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_XC_4 = ITEMS.register("english_breast_collar_bagek_xc_4",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_xc_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_1 = ITEMS.register("english_breast_collar_bagek_xc_fluffy_1",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_xc_fluffy_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_2 = ITEMS.register("english_breast_collar_bagek_xc_fluffy_2",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_xc_fluffy_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_3 = ITEMS.register("english_breast_collar_bagek_xc_fluffy_3",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_xc_fluffy_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_XC_FLUFFY_4 = ITEMS.register("english_breast_collar_bagek_xc_fluffy_4",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_xc_fluffy_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_FREE_1 = ITEMS.register("english_breast_collar_bagek_free_1",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_free_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_FREE_2 = ITEMS.register("english_breast_collar_bagek_free_2",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_free_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_FREE_3 = ITEMS.register("english_breast_collar_bagek_free_3",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_free_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishBreastCollar> ENGLISH_BREAST_COLLAR_BAGEK_FREE_4 = ITEMS.register("english_breast_collar_bagek_free_4",
            () -> new EnglishBreastCollar("english_breast_collar_bagek_free_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<WesternBreastCollarItem> WESTERN_BREAST_COLLAR_BAGEK_1 = ITEMS.register("western_breast_collar_bagek_1",
            () -> new WesternBreastCollarItem("western_breast_collar_bagek_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternBreastCollarItem> WESTERN_BREAST_COLLAR_BAGEK_2 = ITEMS.register("western_breast_collar_bagek_2",
            () -> new WesternBreastCollarItem("western_breast_collar_bagek_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternBreastCollarItem> WESTERN_BREAST_COLLAR_BAGEK_3 = ITEMS.register("western_breast_collar_bagek_3",
            () -> new WesternBreastCollarItem("western_breast_collar_bagek_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<WesternBreastCollarItem> WESTERN_BREAST_COLLAR_BAGEK_4 = ITEMS.register("western_breast_collar_bagek_4",
            () -> new WesternBreastCollarItem("western_breast_collar_bagek_4", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));

    public static final RegistryObject<EnglishLegWraps> ENGLISH_LEG_WRAPS_HORSESHOE_BAGEK_1 = ITEMS.register("english_leg_wraps_horseshoe_bagek_1",
            () -> new EnglishLegWraps("english_leg_wraps_horseshoe_bagek_1", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishLegWraps> ENGLISH_LEG_WRAPS_HORSESHOE_BAGEK_2 = ITEMS.register("english_leg_wraps_horseshoe_bagek_2",
            () -> new EnglishLegWraps("english_leg_wraps_horseshoe_bagek_2", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));
    public static final RegistryObject<EnglishLegWraps> ENGLISH_LEG_WRAPS_HORSESHOE_BAGEK_3 = ITEMS.register("english_leg_wraps_horseshoe_bagek_3",
            () -> new EnglishLegWraps("english_leg_wraps_horseshoe_bagek_3", new Item.Properties()
                    .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64)));



}
