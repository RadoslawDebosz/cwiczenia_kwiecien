package com.company.box;

public class AppBox {

    public static void main(String[] args){

        String color = "Red";
        double width = -12;
        double length = 12;
        double height = -12;

        String defaultColor = "Yellow";
        double defaultWidth = 1.0;
        double defaultLength = 1.0;
        double defaultHeight = 1.0;

        double substance = 120;

        BoxValidatorWithDefaults boxValidatorWithDefaults = new BoxValidatorWithDefaults();
        Box box = new Box(color, width, length, height);
        Box defaultBox = new Box(defaultColor, defaultWidth, defaultLength, defaultHeight);
        Box box2 = boxValidatorWithDefaults.validate(box, defaultBox);
        System.out.println(box2);
    }
}
