package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the color: ");
        String color = input.next().toLowerCase();

        System.out.println("Enter the material: ");
        String material = input.next().toLowerCase();

        Block redBlock = Block.createBlock("red", "wool");
        Block whiteBlock = Block.createBlock("white", "wool");
        Block whiteBlock2 = Block.createBlock("white", "plastic");
        Block orangeBlock = Block.createBlock("orange", "wool");

        List<Block> block = new ArrayList<>();
        block.add(redBlock);
        block.add(whiteBlock);
        block.add(whiteBlock2);
        block.add(orangeBlock);
        Wall wall = new Wall(block);

        Optional<Block> foundColor = wall.findBlockByColor(color);
        if(foundColor.isPresent()){
            System.out.println("Color block "+color+" found");
        }else{
            System.out.println("Color block not found "+color+"!");
        }

        List<Block> foundMaterial = wall.findBlocksByMaterial(material);
        System.out.println("Blocks with material found "+material+": " + foundMaterial.size());

        int totalCount = wall.count();
        System.out.println("Number of all blocks: " + totalCount);

    }
}