package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Block redBlock = new BasicBlock("Red","Wełna");
        Block whiteBlock = new BasicBlock("White","Wełna");
        Block whiteBlock2 = new BasicBlock("White","Plastik");

        List<Block> block = new ArrayList<>();
        block.add(redBlock);
        block.add(whiteBlock);
        block.add(whiteBlock2);
        Wall wall = new Wall(block);

        Optional<Block> foundColor = wall.findBlockByColor("White");
        if(foundColor.isPresent()){
            System.out.println("Blok o kolorze White odnaleziono");
        }else{
            System.out.println("Nie odnalezion bloku o kolerze White!");
        }

        List<Block> foundMaterial = wall.findBlocksByMaterial("Wełna");
        System.out.println("Odnaleziono bloki z materiału Wełna: " + foundMaterial.size());

        int totalCount = wall.count();
        System.out.println("Liczba wszystkich bloków: " + totalCount);

    }
}