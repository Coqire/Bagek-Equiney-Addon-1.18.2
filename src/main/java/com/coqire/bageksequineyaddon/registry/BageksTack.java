package com.coqire.bageksequineyaddon.registry;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.*;
import com.coqire.bageksequineyaddon.Bageksequineyaddon;
import com.coqire.bageksequineyaddon.item.BageksAddonCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class BageksTack {

    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bageksequineyaddon.Mod_ID);

    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLE_RACING_BAGEK;
    public static final List<RegistryObject<EnglishBridleItem>> ENGLISH_BRIDLE_RACING_BAGEK_B;

    public static final List<RegistryObject<HalterItem>> HALTER_BAGEK;
    public static final List<RegistryObject<HalterItem>> HALTER_FLUFFY_BAGEK;
    public static final List<RegistryObject<HalterItem>> FLYMASK_BAGEK;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK_PLAID;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK_RAINSHEET;
    public static final List<RegistryObject<PastureBlanketItem>> PASTURE_BLANKET_BAGEK_FLYSHEET;
    public static final List<RegistryObject<EnglishBreastCollar>> QUARTERSHEET_BAGEK;
    public static final List<RegistryObject<EnglishBreastCollar>> QUARTERSHEET_BAGEK_PLAID;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_XC_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_ENGLISH_BAGEK;
    public static final List<RegistryObject<EnglishBlanketItem>> ENGLISH_BLANKET_BAGEK_PLAID;
    public static final List<RegistryObject<WesternBlanketItem>> WESTERN_BLANKET_BAGEK;
    public static final List<RegistryObject<WesternBlanketItem>> WESTERN_BLANKET_BAGEK_RACING;
    public static final List<RegistryObject<WesternLegWraps>> WESTERN_LEG_WRAPS_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_BAGEK_XC;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_ENGLISH_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_TRAVEL_BAGEK;
    public static final List<RegistryObject<EnglishLegWraps>> ENGLISH_LEG_WRAPS_EARBONNET_BAGEK;



    public BageksTack() {
    }


    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.Keys.ITEMS, "bageksequineyaddon");

        ENGLISH_BRIDLE_RACING_BAGEK = new ArrayList();
        ENGLISH_BRIDLE_RACING_BAGEK_B = new ArrayList();

        HALTER_BAGEK = new ArrayList();
        HALTER_FLUFFY_BAGEK = new ArrayList();
        FLYMASK_BAGEK = new ArrayList();

        PASTURE_BLANKET_BAGEK = new ArrayList();
        PASTURE_BLANKET_BAGEK_FLYSHEET = new ArrayList();
        PASTURE_BLANKET_BAGEK_RAINSHEET = new ArrayList();
        PASTURE_BLANKET_BAGEK_PLAID = new ArrayList();

        QUARTERSHEET_BAGEK = new ArrayList();
        QUARTERSHEET_BAGEK_PLAID = new ArrayList();

        ENGLISH_BLANKET_XC_BAGEK = new ArrayList();
        ENGLISH_BLANKET_ENGLISH_BAGEK = new ArrayList();
        ENGLISH_BLANKET_BAGEK_PLAID = new ArrayList();
        WESTERN_BLANKET_BAGEK = new ArrayList();
        WESTERN_BLANKET_BAGEK_RACING = new ArrayList();

        WESTERN_LEG_WRAPS_BAGEK = new ArrayList();
        ENGLISH_LEG_WRAPS_BAGEK_XC = new ArrayList();
        ENGLISH_LEG_WRAPS_ENGLISH_BAGEK = new ArrayList();
        ENGLISH_LEG_WRAPS_TENDON_BAGEK = new ArrayList();
        ENGLISH_LEG_WRAPS_TENDON_FLUFFY_BAGEK = new ArrayList();
        ENGLISH_LEG_WRAPS_TRAVEL_BAGEK = new ArrayList();
        ENGLISH_LEG_WRAPS_EARBONNET_BAGEK = new ArrayList();



        int var1 = 28;
        var rContext = new Object() {
            int var2 = 1;
        };

        while (rContext.var2 < var1) {
            int counter = rContext.var2;

            ENGLISH_BRIDLE_RACING_BAGEK.add(ITEMS.register("english_bridle_racing_bagek_" + counter, () ->
                    new EnglishBridleItem("english_bridle_racing_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_BRIDLE_RACING_BAGEK_B.add(ITEMS.register("english_bridle_racing_bagek_b" + counter, () ->
                    new EnglishBridleItem("english_bridle_racing_bagek_b" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            HALTER_BAGEK.add(ITEMS.register("halter_bagek_" + counter, () ->
                    new HalterItem("halter_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            HALTER_FLUFFY_BAGEK.add(ITEMS.register("halter_fluffy_bagek_" + counter, () ->
                    new HalterItem("halter_fluffy_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            FLYMASK_BAGEK.add(ITEMS.register("flymask_bagek_" + counter, () ->
                    new HalterItem("flymask_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            PASTURE_BLANKET_BAGEK.add(ITEMS.register("pasture_blanket_bagek_" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            PASTURE_BLANKET_BAGEK_PLAID.add(ITEMS.register("pasture_blanket_bagek_plaid_" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_bagek_plaid_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            PASTURE_BLANKET_BAGEK_RAINSHEET.add(ITEMS.register("pasture_blanket_bagek_rainsheet_" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_bagek_rainsheet_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            PASTURE_BLANKET_BAGEK_FLYSHEET.add(ITEMS.register("pasture_blanket_bagek_flysheet_" + counter, () ->
                    new PastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier.NONE, 0,
                            "pasture_blanket_bagek_flysheet_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            QUARTERSHEET_BAGEK.add(ITEMS.register("quartersheet_bagek_" + counter, () ->
                    new EnglishBreastCollar("quartersheet_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            QUARTERSHEET_BAGEK_PLAID.add(ITEMS.register("quartersheet_bagek_plaid_" + counter, () ->
                    new EnglishBreastCollar("quartersheet_bagek_plaid_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_BLANKET_XC_BAGEK.add(ITEMS.register("english_blanket_xc_bagek_" + counter, () ->
                    new EnglishBlanketItem("english_blanket_xc_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_BLANKET_ENGLISH_BAGEK.add(ITEMS.register("english_blanket_english_bagek_" + counter, () ->
                    new EnglishBlanketItem("english_blanket_english_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_BLANKET_BAGEK_PLAID.add(ITEMS.register("english_blanket_bagek_plaid_" + counter, () ->
                    new EnglishBlanketItem("english_blanket_bagek_plaid_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            WESTERN_BLANKET_BAGEK.add(ITEMS.register("western_blanket_bagek_" + counter, () ->
                    new WesternBlanketItem("western_blanket_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            WESTERN_BLANKET_BAGEK_RACING.add(ITEMS.register("western_blanket_bagek_racing_" + counter, () ->
                    new WesternBlanketItem("western_blanket_bagek_racing_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            WESTERN_LEG_WRAPS_BAGEK.add(ITEMS.register("western_leg_wraps_bagek_" + counter, () ->
                    new WesternLegWraps("western_leg_wraps_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_LEG_WRAPS_BAGEK_XC.add(ITEMS.register("english_leg_wraps_bagek_xc_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_bagek_xc_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_LEG_WRAPS_ENGLISH_BAGEK.add(ITEMS.register("english_leg_wraps_english_bagek_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_english_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_LEG_WRAPS_TENDON_BAGEK.add(ITEMS.register("english_leg_wraps_tendon_bagek_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_LEG_WRAPS_TENDON_BAGEK.add(ITEMS.register("english_leg_wraps_tendon_bagek_f" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_tendon_bagek_f" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_LEG_WRAPS_TRAVEL_BAGEK.add(ITEMS.register("english_leg_wraps_travel_bagek_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_travel_bagek_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));

            ENGLISH_LEG_WRAPS_EARBONNET_BAGEK.add(ITEMS.register("english_leg_wraps_bagek_earbonnet_" + counter, () ->
                    new EnglishLegWraps("english_leg_wraps_bagek_earbonnet_" + counter, (new Item.Properties())
                            .tab(BageksAddonCreativeModeTab.BAGEKSADDON_TAB).stacksTo(64))
            ));



            ++rContext.var2;
        }
    }
}
