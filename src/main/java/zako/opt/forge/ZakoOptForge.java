package zako.opt.forge;

import net.minecraftforge.fml.common.Mod;

/**
 * Forge 1.20.1 bootstrap for the ZakoOpt port.
 *
 * The original optimization implementation is kept under upstream-reference/
 * until each feature and mixin has been ported to the 1.20.1 Forge/Mojang API.
 */
@Mod(ZakoOptForge.MOD_ID)
public final class ZakoOptForge {
    public static final String MOD_ID = "zakoopt";

    public ZakoOptForge() {
        // Client-only optimization hooks will be registered here as they are ported.
    }
}
