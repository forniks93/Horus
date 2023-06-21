package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {

    private List<Block> blocks;

    public Wall(List<Block> blocks){
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {

        for(Block block : blocks){
            if(block.getColor().equals(color)){
                return Optional.of(block);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {

        List<Block> matchBlocks = new ArrayList<>();

        for(Block block:blocks){
            if(block.getMaterial().equals(material)){
                matchBlocks.add(block);
            }
        }
        return matchBlocks;
    }

    @Override
    public int count() {
        int totalCount = 0;
        for(Block block: blocks){
            totalCount +=1;
            if (block instanceof CompositeBlock){
                CompositeBlock compositeBlock = (CompositeBlock) block;
                totalCount +=compositeBlock.getBlocks().size()-1;
            }
        }
        return totalCount;
    }
}
