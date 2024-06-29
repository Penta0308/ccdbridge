# CC:Destroy Bridge

Available for **1.20.1 Forge**.
Requires [CC:C Bridge](https://github.com/tweaked-programs/cccbridge) *1.6.3* and [Destroy](https://github.com/petrolpark/Destroy/) *0.8*!

[![Download at Modrinth](https://img.shields.io/modrinth/dt/7ZVzo8Of?logo=modrinth)](https://modrinth.com/mod/ccdbridge)

  
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
