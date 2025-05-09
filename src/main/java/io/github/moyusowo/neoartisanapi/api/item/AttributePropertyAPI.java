package io.github.moyusowo.neoartisanapi.api.item;

import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;

public interface AttributePropertyAPI {

    void addGlobalAttribute(NamespacedKey attributeKey, Object value);

    void addItemstackAttribute(NamespacedKey attributeKey, Object value);

    boolean hasGlobalAttribute(NamespacedKey attributeKey);

    boolean hasItemstackAttribute(NamespacedKey attributeKey);

    @NotNull <T> T getGlobalAttributeValue(NamespacedKey attributeKey);

    @NotNull <T> T getItemstackAttributeValue(NamespacedKey attributeKey);

    boolean isEmpty();

    NamespacedKey[] getItemstackAttributeKeys();
}
