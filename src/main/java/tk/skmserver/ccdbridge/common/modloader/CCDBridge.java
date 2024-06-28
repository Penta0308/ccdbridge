package tk.skmserver.ccdbridge.common.modloader;

import com.mojang.logging.LogUtils;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import org.slf4j.Logger;
import tk.skmserver.ccdbridge.common.CCDRegistries;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CCDBridge.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CCDBridge {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "ccdbridge";
    // Directly reference a slf4j logger
    @SuppressWarnings("unused")
    private static final Logger LOGGER = LogUtils.getLogger();

    public CCDBridge() {
        CCDRegistries.register();
    }

    @SubscribeEvent
    public static void complete(FMLLoadCompleteEvent event) {
        event.enqueueWork(CCDRegistries::registerCompat);
    }
}
