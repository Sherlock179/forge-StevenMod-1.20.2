package net.nickandkyle.stevenmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nickandkyle.stevenmod.StevenMod;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, StevenMod.MOD_ID);

    public static final RegistryObject<Item> GOLFBALL = Items.register("golfball",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus) {
        Items.register(eventbus);
    }
}
