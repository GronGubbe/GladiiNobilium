package net.grongubbe.gladii_nobilium.item;

import net.grongubbe.gladii_nobilium.Gladii_Nobilium;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Gladii_Nobilium.MOD_ID);

    public static final RegistryObject<Item> GOLDPLATEDBONESCIMITAR = ITEMS.register("Gold plated bone Scimitar",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
