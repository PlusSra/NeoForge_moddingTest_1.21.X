package net.plus.Testingmods.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.plus.Testingmods.TestingMod;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestingMod.MOD_ID);

    public static final DeferredItem<Item> ALEXANDRITE = ITEMS.register("Alexandrite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
