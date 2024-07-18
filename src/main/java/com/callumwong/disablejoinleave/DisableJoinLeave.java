package com.callumwong.disablejoinleave;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisableJoinLeave implements DedicatedServerModInitializer {
    public static final String MOD_ID = "disablejoinleave";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeServer() {
        LOGGER.info("Join and leave messages will be suppressed.");
    }
}
