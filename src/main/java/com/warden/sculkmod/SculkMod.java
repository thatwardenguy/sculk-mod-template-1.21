package com.warden.sculkmod;

import com.warden.sculkmod.item.moditems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SculkMod implements ModInitializer {
	public static final String MOD_ID = "sculkmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		moditems.registermoditems();
	}
}