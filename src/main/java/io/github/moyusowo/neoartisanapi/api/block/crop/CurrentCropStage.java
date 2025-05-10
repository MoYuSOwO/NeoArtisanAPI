package io.github.moyusowo.neoartisanapi.api.block.crop;

import org.bukkit.NamespacedKey;

@SuppressWarnings("unused")
public interface CurrentCropStage {

    int getBlockState();

    NamespacedKey[] getDrops();

    boolean hasNextStage();

    CurrentCropStage getNextStage();

    int getMaxStage();

}
