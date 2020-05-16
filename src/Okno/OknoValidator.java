package Okno;

public class OknoValidator {

    public boolean validator(double totalWidth, double totalHeight, double frameWidth) {

        boolean check = false;

        if (frameWidth > 0 && totalHeight > 0 && totalWidth > 0) {
            check = true;
            if (2 * frameWidth > 0.1 * totalHeight && 2 * frameWidth > 0.1 * totalWidth) {
                check = false;
            }
        } else {
            check = false;
        }
        return check;
    }
}

