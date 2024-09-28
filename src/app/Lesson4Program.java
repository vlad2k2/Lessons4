package app;

public class Lesson4Program {

    static int productNo = 0;
    static int day;
    static double totalSales;
    static String product;
    static double daySales;
    static double price;
    static double numberDay;

    static public void main(String[] args){

        product = "smartphone";
        //daySales = 2430.68;
        price = 607.67;
        day = 5;
        numberDay = 4;
        daySales = numberDay * price;
        //numberDay = daySales / price;
        //totalSales = 12153.41;
        totalSales = day * price * numberDay;

        // Знаходимо ціну за одиницю не повина бути піся десятковой більше 3 знаків кількість 3 - 9
//        double price2  = daySales / 2;
//        System.out.println(price2);
//        double price  = daySales / 3;
//        System.out.println(price);
//        double price4  = daySales / 4;
//        System.out.println(price4);
//        double price5  = daySales / 5;
//        System.out.println(price5);
//        double price6  = daySales / 6;
//        System.out.println(price6);
//        double price7  = daySales / 7;
//        System.out.println(price7);
//        double price8  = daySales / 8;
//        System.out.println(price8);
//        double price9  = daySales / 9;
//        System.out.println(price9);
        //1215.34
        //810.2266666666666
        //607.67
        //486.13599999999997
        //405.1133333333333
        //347.23999999999995
        //303.835
        //270.0755555555555
        // ціну за одиницю можемо вибрати 607.67, 1215.34

        // Принт продукт 1
        System.out.printf("Product No %d: %s,\n" +
                "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n",++productNo, product, day,
                (float)totalSales, daySales);

        // зміні продукт 2
        product = "laptop";
        //daySales = 1498.12;
        price = 749.06;
        day = 7;
        numberDay = 2;
        daySales = numberDay * price;
        //numberDay = daySales / price;
        //totalSales = 12153.41;
        totalSales = day * price * numberDay;
        // Знаходимо ціну за одиницю не повина бути піся десятковой більше 3 знаків кількість 3 - 9
//        double price2  = daySales / 2;
//        System.out.println(price2);
//        double price  = daySales / 3;
//        System.out.println(price);
//        double price4  = daySales / 4;
//        System.out.println(price4);
//        double price5  = daySales / 5;
//        System.out.println(price5);
//        double price6  = daySales / 6;
//        System.out.println(price6);
//        double price7  = daySales / 7;
//        System.out.println(price7);
//        double price8  = daySales / 8;
//        System.out.println(price8);
//        double price9  = daySales / 9;
//        System.out.println(price9);
        // ціну за одиницю можемо вибрати 749.06, 374.53
        // Принт продукт 2
        System.out.printf("Product No %d: %s,\n" +
                        "total sales for %d days is EUR %.2f,\n" +
                        "sales by day is EUR %.2f.",++productNo, product, day,
                totalSales, daySales);


    }

}
