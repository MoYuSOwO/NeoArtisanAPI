package io.github.moyusowo.neoartisanapi.api.item;

import io.github.moyusowo.neoartisanapi.api.attribute.AttributeTypeRegistryAPI;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface AttributePropertyAPI {

    /**
     * 获取新的自定义物品属性配置实例。
     *
     * @return 新的自定义物品属性配置实例
     */
    static AttributePropertyAPI createAttributeProperty() {
        return Bukkit.getServicesManager().load(AttributePropertyAPI.class);
    }

    AttributePropertyAPI empty();

    void addGlobalAttribute(NamespacedKey attributeKey, Object value);

    void addItemstackAttribute(NamespacedKey attributeKey, Object value);

    boolean hasGlobalAttribute(NamespacedKey attributeKey);

    boolean hasItemstackAttribute(NamespacedKey attributeKey);

    @NotNull <T> T getGlobalAttributeValue(NamespacedKey attributeKey);

    @NotNull <T> T getItemstackAttributeValue(NamespacedKey attributeKey);

    boolean isEmpty();

    NamespacedKey[] getItemstackAttributeKeys();
}
