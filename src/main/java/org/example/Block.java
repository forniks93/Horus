package org.example;


public interface Block {
    String getColor();

    String getMaterial();

    static Block createBlock(String color, String material) {
        if(color.isEmpty() || material.isEmpty()){
            throw new IllegalArgumentException("Color and material cannot be empty");
        }
        return new BasicBlock(color, material);
    }
}
