package Okno;


public class AppOkno {


    public static void main(String[] args) {

        double totalWidth = 20;
        double totalHeight = 20;
        double frameWidth = 1;

        OknoValidator OknoValidator = new OknoValidator();
        if (OknoValidator.validator(totalWidth, totalHeight, frameWidth)) {

            Okno o1 = new Okno(totalWidth, totalHeight, frameWidth);
            System.out.println(o1);
        }
        else{
            System.out.println("Wrong Paramenters");
            Okno o1 = new Okno(0, 0, 0);
            System.out.println(o1);
        }

        OknoUtil Util = new OknoUtil();
        Okno o2 = new Okno(20, 20, 1);
        System.out.println(Util.totalPrice(o2));

    }

}

