package io.github.moyusowo.neoartisanapi.api.item;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface AttributeProperty {

    /**
     * 获取新的自定义物品属性配置实例。
     *
     * @return 新的自定义物品属性配置实例
     */
    static AttributeProperty createAttributeProperty() {
        return Bukkit.getServicesManager().load(AttributeProperty.class);
    }

    AttributeProperty empty();

    void addGlobalAttribute(NamespacedKey attributeKey, Object value);

    void addItemstackAttribute(NamespacedKey attributeKey, Object value);

    boolean hasGlobalAttribute(NamespacedKey attributeKey);

    boolean hasItemstackAttribute(NamespacedKey attributeKey);

    @NotNull <T> T getGlobalAttributeValue(NamespacedKey attributeKey);

    @NotNull <T> T getItemstackAttributeValue(NamespacedKey attributeKey);

    boolean isEmpty();

    NamespacedKey[] getItemstackAttributeKeys();
}
