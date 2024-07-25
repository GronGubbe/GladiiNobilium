package net.grongubbe.gladii_nobilium.item;

import net.grongubbe.gladii_nobilium.Gladii_Nobilium;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gladii_Nobilium.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GLADIINOBILIUM_TAB = CREATIVE_MODE_TABS.register("gladiinobilium_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BONESCIMITAR.get()))
                    .title(Component.translatable("creativetab.gladiinobilium_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BONESCIMITAR.get());
                        pOutput.accept(ModItems.GOLDPLATEDBONESCIMITAR.get());
                        pOutput.accept(ModItems.COPPERSCIMITAR.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
