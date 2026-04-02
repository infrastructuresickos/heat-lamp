package com.infrastructuresickos.heat_lamp;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(HeatLamp.MOD_ID)
public class HeatLamp {
    public static final String MOD_ID = "heat_lamp";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public HeatLamp() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("HeatLamp initialized");
    }
}
