package tk.skmserver.ccdbridge.common.minecraft.mixin;

import cc.tweaked_programs.cccbridge.common.minecraft.blockEntity.PeripheralBlockEntity;
import com.petrolpark.destroy.block.entity.VatControllerBlockEntity;
import dan200.computercraft.api.peripheral.IPeripheral;
import net.minecraft.core.Direction;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import tk.skmserver.ccdbridge.common.computercraft.peripherals.VatBlockPeripheral;
import tk.skmserver.ccdbridge.common.minecraft.mixininterface.VatControllerBlockEntityMixinInterface;

@Mixin(VatControllerBlockEntity.class)
public class MixinVatControllerBlockEntity implements VatControllerBlockEntityMixinInterface, PeripheralBlockEntity {

    @Shadow(remap = false)
    protected float UVPower;

    @SuppressWarnings("AddedMixinMembersNamePattern")
    @Unique
    private VatBlockPeripheral peripheral;


    @Unique
    public float ccdbridge$getUVPower() {
        return UVPower;
    }

    /*@Unique
    public LazyOptional<IPeripheral> getPeripheral(Level level, BlockPos pos, Direction dir) {
        if (level.getBlockEntity(pos) instanceof PeripheralBlockEntity peripheralBlockEntity) {
            IPeripheral peripheral = peripheralBlockEntity.getPeripheral(dir);
            if (peripheral != null)
                return LazyOptional.of(() -> peripheral);
        }
        return LazyOptional.empty();
    }*/

    @Unique
    public IPeripheral getPeripheral(@NotNull Direction side) {
        if (peripheral == null)
            peripheral = new VatBlockPeripheral((VatControllerBlockEntity) (Object) this);
        return peripheral;
    }
}
