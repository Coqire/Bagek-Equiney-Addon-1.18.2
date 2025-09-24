package com.coqire.bageksequineyaddon;

import com.coqire.bageksequineyaddon.item.ModItems;
import com.coqire.bageksequineyaddon.registry.BageksTack;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(Bageksequineyaddon.Mod_ID)
public class Bageksequineyaddon {
    public static final String Mod_ID = "bageksequineyaddon";

    private static final Logger LOGGER = LogUtils.getLogger();



    public Bageksequineyaddon() {
    IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        BageksTack.init(eventBus);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
}

    private void setup(final FMLCommonSetupEvent event) {

    }
}
