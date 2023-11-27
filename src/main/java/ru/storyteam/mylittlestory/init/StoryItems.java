package ru.storyteam.mylittlestory.init;

import net.minecraft.world.item.Item;
import org.zeith.hammerlib.annotations.RegistryName;
import org.zeith.hammerlib.annotations.SimplyRegister;
import ru.storyteam.mylittlestory.content.items.SilverSwordItem;

@SimplyRegister
public interface StoryItems {
    @RegistryName("silver_sword")
    SilverSwordItem SILVER_SWORD = new SilverSwordItem(StoryTiers.SILVER, 3, -2.4F, new Item.Properties());
}
