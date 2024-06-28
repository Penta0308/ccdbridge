package tk.skmserver.ccdbridge.common.modloader;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import tk.skmserver.ccdbridge.client.CCDConfig;
import tk.skmserver.ccdbridge.common.CCDRegistries;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CCDBridge.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CCDBridge {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "ccdbridge";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public CCDBridge() {
        CCDRegistries.register();
    }

    @SubscribeEvent
    public static void complete(FMLLoadCompleteEvent event) {
        event.enqueueWork(CCDRegistries::registerCompat);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        //event.registerBlockEntityRenderer(CCCRegistries.REDROUTER_BLOCK_ENTITY.get(), RedRouterBlockEntityRenderer::new);
        //event.registerBlockEntityRenderer(CCCRegistries.ANIMATRONIC_BLOCK_ENTITY.get(), AnimatronicBlockEntityRenderer::new);
    }
}
