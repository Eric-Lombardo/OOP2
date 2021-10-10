package com.company;

public class Main {

    public static void main(String[] args) {
	    // TEST for Bedroom Class
        System.out.println("=================== Bedroom =======================");
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

        // TEST for Printer Class
        System.out.println("=================== Printer =======================");
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50)); // 100
        System.out.println("initial page count = " +printer.getPagesPrinted()); // initial page count = 0
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted()); // Pages printed was 2 new total print count for printer = 2
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted()); // Pages printed was 1 new total print count for printer = 3

        // TEST for Car Class
        System.out.println("=================== Car =======================");
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}
