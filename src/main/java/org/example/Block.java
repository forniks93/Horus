package org.example;

public interface Block {
    String getColor();

    String getMaterial();

    static Block createBlock(String color, String material) {
        return new BasicBlock(color, material);
    }
}
