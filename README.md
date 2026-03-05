# CC:Destroy Bridge

Available for **1.20.1 Forge**.
Requires [Create] *6.0.8* and [CC:C Bridge](https://github.com/tweaked-programs/cccbridge) *1.7.1* and [Destroy](https://github.com/petrolpark/Destroy/) *0.1.3-i+0*!

  
About
-----
This mod adds interop between [CC:Tweaked](https://github.com/cc-tweaked/cc-tweaked) and [Destroy](https://github.com/petrolpark/Destroy/) (currently Vat only).

Description
-----------
![vat_with_computer.png](https://github.com/Penta0308/ccdbridge/blob/main/docs/vat_with_computer.png "vat_with_computer.png")


Vat Controller exposes following Lua functions:
```
getPressure(): float
getTemperature(): float
getUVStrength(): float
getCapacity(): float
getFluidLevel(): float
getMixture(): Map<String, Float>
```

![screen_with_periph.png](https://github.com/Penta0308/ccdbridge/blob/main/docs/screen_with_periph.png "screen_with_periph.png")
