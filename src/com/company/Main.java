package com.company;

public class Main {

    public static void main(String[] args) {
	    // TEST for Bedroom Class
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedRoom = new Bedroom("Stew room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed(); // "BEDROOM -> start make bed" & "BED -> The bed is being made"
        bedRoom.getLamp().turnOn(); // "Lamp turning on"
    }
}
