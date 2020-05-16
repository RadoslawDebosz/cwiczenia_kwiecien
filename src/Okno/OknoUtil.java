package Okno;

public class OknoUtil {
    private double glasArea(Okno o1) {
        double glasArea;
        glasArea = (o1.getTotalWidth() - (2 * o1.getFrameWidth())) * (o1.getTotalHeight() - (2 * o1.getFrameWidth()));
        System.out.println("Glas area is " + glasArea);
        return glasArea;
    }

    private double frameArea(Okno o1) {
        double frameArea;
        frameArea = (o1.getTotalWidth() * (o1.getFrameWidth())) + (o1.getTotalHeight() - (o1.getFrameWidth()));
        System.out.println("Frame area is " + frameArea);
        return frameArea;
    }

    public double totalPrice(Okno o1) {
        final double framePrice = 15;
        final double glasPrice = 30;

        return (frameArea(o1) * framePrice) + (glasArea(o1) * glasPrice);


    }
}
