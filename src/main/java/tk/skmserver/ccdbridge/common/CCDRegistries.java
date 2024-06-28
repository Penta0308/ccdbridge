package tk.skmserver.ccdbridge.common;

import cc.tweaked_programs.cccbridge.common.computercraft.TweakedPeripheralProvider;
import dan200.computercraft.api.ForgeComputerCraftAPI;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings({"unused"})
public class CCDRegistries {
    //private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CCDBridge.MODID);
    //private static final DeferredRegister<PaintingVariant> PAINTINGS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, CCDBridge.MODID);
    //private static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CCDBridge.MODID);
    //private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CCDBridge.MODID);
    //public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CCDBridge.MODID);
    //public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CCDBridge.MODID);
    //public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CCDBridge.MODID);

    //public static final RegistryObject<Block> VAT_BLOCK = BLOCKS.register("vat_block", () -> new VatBlock(VAT_BLOCK_PROPERTIES));
    //public static final RegistryObject<TweakedBlockItem> VAT_BLOCK_ITEM = ITEMS.register("vat_block", () -> new TweakedBlockItem(VAT_BLOCK.get(), VatBlockPeripheral.getVersion()));
    //public static final RegistryObject<BlockEntityType<VatBlockEntity>> VAT_BLOCK_ENTITY = BLOCK_ENTITIES.register("vat_block_entity", () -> BlockEntityType.Builder.of(VatBlockEntity::new, VAT_BLOCK.get()).build(null));

    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //BLOCKS.register(modEventBus);
        //BLOCK_ENTITIES.register(modEventBus);
        //ENTITIES.register(modEventBus);
        //SOUNDS.register(modEventBus);

        //ITEMS.register(modEventBus);

        //PAINTINGS.register("funny_vats", () -> new PaintingVariant(32,16));
        //PAINTINGS.register(modEventBus);
        //CREATIVE_MODE_TABS.register(modEventBus);
    }

    public static void registerCompat() {
        // Create stuff
        //AllDisplayBehaviours.assignBlockEntity(AllDisplayBehaviours.register(new ResourceLocation(CCDBridge.MODID, "source_block_display_source"), new SourceBlockDisplaySource()), CCDRegistries.SOURCE_BLOCK_ENTITY.get());
        //AllDisplayBehaviours.assignBlockEntity(AllDisplayBehaviours.register(new ResourceLocation(CCDBridge.MODID, "target_block_display_target"), new TargetBlockDisplayTarget()), CCDRegistries.TARGET_BLOCK_ENTITY.get());

        //AllInteractionBehaviours.registerBehaviour(CCDRegistries.ANIMATRONIC_BLOCK.getId(), new AnimatronicInteractionBehaviour());

        // ComputerCraft stuff
        ForgeComputerCraftAPI.registerPeripheralProvider(new TweakedPeripheralProvider());
    }
}