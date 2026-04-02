package com.infrastructuresickos.heat_lamp;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("heat_lamp")
public class HeatLamp {
    public static final Logger LOGGER = LogManager.getLogger();

    public HeatLamp() {
        LOGGER.info("HeatLamp mod initialized");
    }
}
