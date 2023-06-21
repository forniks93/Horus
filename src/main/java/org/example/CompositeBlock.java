package org.example;

import java.util.List;

public interface CompositeBlock extends Block{
    List<Block> getBlocks();

    @Override
    default String getColor() {
        return getColor();
    }

    @Override
    default String getMaterial() {
        return getMaterial();
    }
}
