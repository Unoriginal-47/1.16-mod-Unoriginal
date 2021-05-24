package com.Unoriginal_47.mod;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(MyMod.MOD_ID)
public class MyMod
{
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "emerald_expansion";

    public MyMod() {
                FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
               
                MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        
    }
  
}
