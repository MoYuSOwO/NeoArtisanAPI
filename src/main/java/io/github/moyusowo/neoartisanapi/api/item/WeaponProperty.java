package io.github.moyusowo.neoartisanapi.api.item;

@SuppressWarnings("unused")
public record WeaponProperty(Float speed, Float knockback, Float damage) {
    public static final WeaponProperty EMPTY = new WeaponProperty(null, null, null);
}
