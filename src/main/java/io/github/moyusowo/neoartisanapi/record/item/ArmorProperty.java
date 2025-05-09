package io.github.moyusowo.neoartisanapi.record.item;

import org.bukkit.inventory.EquipmentSlot;

public record ArmorProperty(Integer armor, Integer armorToughness, EquipmentSlot slot) {
    public static final ArmorProperty EMPTY = new ArmorProperty(null, null, null);
}
