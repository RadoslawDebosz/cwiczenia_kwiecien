package com.company.box;

public class Box {

    private String color;
    private double width;
    private double length;
    private double height;

    public Box(String color, double width, double length, double height) {
        this.color = color;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double boxVolume() {
        return this.width * this.length * this.height;
    }

    public boolean substanceVolume(double substance) {
        /*if (substance < BoxVolume()) {
            return true;
        } else {
            return false;
        }*/
        return substance < boxVolume();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;

        if (Double.compare(box.width, width) != 0) return false;
        if (Double.compare(box.length, length) != 0) return false;
        if (Double.compare(box.height, height) != 0) return false;
        return color != null ? color.equals(box.color) : box.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color != null ? color.hashCode() : 0;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return """
        Box Color :     %s
        Box Width :     %s
        Box Lenght :    %s
        Box Height :    %s
        """.formatted(color, width, length, height);
    }
}
