package io.github.moyusowo.neoartisanapi.api.item;

@SuppressWarnings("unused")
public record FoodProperty(Integer nutrition, Float saturation, boolean canAlwaysEat) {
    public static final FoodProperty EMPTY = new FoodProperty(null, null, false);
}
