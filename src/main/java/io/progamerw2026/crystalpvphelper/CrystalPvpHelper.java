package io.progamerw2026.crystalpvphelper;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Crystal PvP Helper - Fabric mod initializer.
 */
public final class CrystalPvpHelper implements ModInitializer {
    public static final String MOD_ID = "crystalpvphelper";
    private static final Logger LOGGER = LoggerFactory.getLogger(CrystalPvpHelper.class);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Crystal PvP Helper");
        ServerLifecycleEvents.SERVER_STARTED.register(server -> LOGGER.info("Crystal PvP Helper Systems Active"));
    }
}
