package com.company.box;

public class BoxValidatorWithDefaults {

    private boolean isBoxWidthValid(double boxWidth) {
        return boxWidth > 0;
    }

    private boolean isBoxLengthValid(double boxLength) {
        return boxLength > 0;
    }

    private boolean isBoxHeightValid(double boxHeight) {
        return boxHeight > 0;
    }

    private boolean isBoxColorValid(String boxColor){
        final String REGEX = "[A-Z][a-z]+";
        return boxColor.matches(REGEX);
    }

    public Box validate(Box boxToValidate, Box defaultBox){

        var color = boxToValidate.getColor();
        var height = boxToValidate.getHeight();
        var length = boxToValidate.getLength();
        var width = boxToValidate.getWidth();

        var defaultColor = defaultBox.getColor();
        var defaultHeight = defaultBox.getHeight();
        var defaultLength = defaultBox.getLength();
        var defaultWidth = defaultBox.getWidth();

        return new Box(
                isBoxColorValid(color) ? color : defaultColor,
                isBoxWidthValid(width) ? width : defaultWidth,
                isBoxLengthValid(length) ? length : defaultLength,
                isBoxHeightValid(height) ? height : defaultHeight);
    }
}
