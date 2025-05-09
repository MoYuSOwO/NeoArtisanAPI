package io.github.moyusowo.neoartisanapi.record.item;

import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public interface AttributeProperty {

    void addGlobalAttribute(NamespacedKey attributeKey, Object value);

    void addItemstackAttribute(NamespacedKey attributeKey, Object value);

    boolean hasGlobalAttribute(NamespacedKey attributeKey);

    boolean hasItemstackAttribute(NamespacedKey attributeKey);

    @NotNull <T> T getGlobalAttributeValue(NamespacedKey attributeKey);

    @NotNull <T> T getItemstackAttributeValue(NamespacedKey attributeKey);

    boolean isEmpty();

    NamespacedKey[] getItemstackAttributeKeys();
}
