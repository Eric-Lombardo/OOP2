package com.company;

public class Bedroom {
//    Directions:
//    this is an exercise in Class Composition. to complete the exercise, you must create five classes with associated
//    member variables and methods. The five classes should be created as follows:
//
//    1) Create a class and name it Lamp. Inside this class should be declared three member variables: style of type
//    String, battery of type boolean, and globRating of type int. All variables should be marked private. A constructor
//    needs to be created which accepts the three member variables as parameters.
//
//    In addition, four methods should also be created: turnOn() has no return type and should print a message
//    that the lamp is being turned on; getStyle() returns the lamp style; isBattery returns the value of battery; and
//    getGlobRating() returns the globRating of the lamp.
//
//    2) Create a class and name it Bed. Five private member variables should be declared: style of type String; and
//    pillows, height, sheets, quilt of type int. A constructor should be coded which accepts these five member variables
//    as parameters.
//
//    Also, six methods should be defined: make() has no return type and prints a message to the effect that the bed
//    is being made; getStyle() which returns the value of style; getPilows() returns the number of pillows; getHeight()
//    returns the height of the bed; getSheets() returns the number of sheets on the bed; and getQuilt() returns the
//    value of quilt.
//
//    3) Create a class with the name Ceiling. There are two member variables for this one, height, and paintedColor,
//    both of type int. there should also be a constructor which accepts both member variables as parameters. there
//    are also two additional methods which should be defined: getheight() shall return the value of height and
//    getPaintedColor(0 should return the value of paintedColor.
//
//    4) Create a class with the name Wall. It contains one member variable, direction, and is of type String.
//    A constructor for Wall should accept one parameter for the member variable direction. A getter should also
//    be defined for the direction field called getDirection().
//
//    5) Create a class with the name Bedroom. This class contains eight member variables: name of type
//    String; wall1, wall2, wall3, wall4 of type Wall; ceiling of type Ceiling; bed of type Bed, and a lamp of type Lamp.
//    The class constructor should accept all eight of the member variables as parameters, and there should also be
//    two additional methods: getLamp() which returns an object of type Lamp, and makeBed() which prints a message that
//    the bed is being made and also calls the make() method in the Bed class.

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("BEDROOM -> start make bed");
        bed.make();
    }
}
