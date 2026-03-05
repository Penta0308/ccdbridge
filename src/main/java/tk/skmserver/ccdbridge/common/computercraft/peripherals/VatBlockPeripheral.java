package tk.skmserver.ccdbridge.common.computercraft.peripherals;

import cc.tweaked_programs.cccbridge.common.computercraft.TweakedPeripheral;
import com.petrolpark.destroy.chemistry.legacy.LegacySpecies;
import com.petrolpark.destroy.chemistry.legacy.ReadOnlyMixture;
import com.petrolpark.destroy.core.chemistry.vat.VatControllerBlockEntity;
import dan200.computercraft.api.lua.LuaException;
import dan200.computercraft.api.lua.LuaFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tk.skmserver.ccdbridge.common.minecraft.mixininterface.VatControllerBlockEntityMixinInterface;

import java.util.Map;
import java.util.stream.Collectors;

public class VatBlockPeripheral implements TweakedPeripheral<VatControllerBlockEntity> {
    private final VatControllerBlockEntity be;

    public VatBlockPeripheral(VatControllerBlockEntity be) {
        this.be = be;
    }

    @Override
    public @NotNull String getType() {
        return "destroy_vat";
    }

    @Override
    public @Nullable VatControllerBlockEntity getTarget() {
        return this.be;
    }

    public static double getVersion() {
        return 1.0D;
    }

    @LuaFunction
    public final float getPressure() throws LuaException {
        VatControllerBlockEntity be = getTarget();
        if (be != null) {
            return be.getPressure();
        }
        throw new LuaException("Unable to find peripheral");
    }

    @LuaFunction
    public final float getTemperature() throws LuaException {
        VatControllerBlockEntity be = getTarget();
        if (be != null) {
            return be.getTemperature();
        }
        throw new LuaException("Unable to find peripheral");
    }

    @LuaFunction
    public final float getUVStrength() throws LuaException {
        VatControllerBlockEntityMixinInterface be = (VatControllerBlockEntityMixinInterface) getTarget();
        if (be != null) {
            return be.ccdbridge$getUVPower();
        }
        throw new LuaException("Unable to find peripheral");
    }

    @LuaFunction
    public final float getCapacity() throws LuaException {
        VatControllerBlockEntity be = getTarget();
        if (be != null) return be.getCapacity();
        throw new LuaException("Unable to find peripheral");
    }

    @LuaFunction
    public final float getFluidLevel() throws LuaException {
        VatControllerBlockEntity be = getTarget();
        if (be != null) return be.getFluidLevel();
        throw new LuaException("Unable to find peripheral");
    }

    @LuaFunction
    public final Map<String, Float> getMixture() throws LuaException {
        VatControllerBlockEntity be = getTarget();
        if (be != null) {
            ReadOnlyMixture mixture = be.getCombinedReadOnlyMixture();
            if (be != null) return mixture.getContents(false).stream().collect(Collectors.toMap(
                    LegacySpecies::getFullID,
                    mixture::getConcentrationOf
            ));

        }
        throw new LuaException("Unable to find peripheral");
    }

}