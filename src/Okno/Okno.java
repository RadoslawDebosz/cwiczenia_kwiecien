package Okno;

public class Okno {

    private double totalWidth;
    private double totalHeight;
    private double frameWidth;


    public Okno(double totalWidth, double totalHeight, double frameWidth) {
        this.totalWidth = totalWidth;
        this.totalHeight = totalHeight;
        this.frameWidth = frameWidth;
    }


    public double getTotalWidth() {
        return totalWidth;
    }

    public double getTotalHeight() {
        return totalHeight;
    }

    public double getFrameWidth() {
        return frameWidth;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Okno okno = (Okno) o;

        if (Double.compare(okno.totalWidth, totalWidth) != 0) return false;
        if (Double.compare(okno.totalHeight, totalHeight) != 0) return false;
        return Double.compare(okno.frameWidth, frameWidth) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(totalWidth);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalHeight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(frameWidth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return """
Window:
Total Height:      %s
Total Width:       %s
Frame Width:       %s
""".formatted(totalHeight, totalWidth, frameWidth);
    }
}
