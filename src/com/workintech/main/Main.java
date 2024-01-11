package com.workintech.main;

import com.workintech.enums.Direction;
import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(LampType.NORMAL,true,100);
        lamp1.turnOn();

        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        ceiling.create();

        Wall northWall = new Wall(Direction.NORTH);
        Wall eastWall = new Wall(Direction.EAST);
        Wall westWall = new Wall(Direction.WEST);
        Wall southWall = new Wall(Direction.SOUTH);


        Bedroom bedroom = new Bedroom(northWall,eastWall,westWall,southWall,ceiling,
                new Lamp(LampType.NORMAL,true,120),
                "Ebeveyn",new Bed("Double",1,1,1,1),
                new Wardrobe(3,3,3),
                new Carpet(2,2,PaintColor.RED));
        System.out.println(bedroom);

        bedroom.createBedroom();


    }
}