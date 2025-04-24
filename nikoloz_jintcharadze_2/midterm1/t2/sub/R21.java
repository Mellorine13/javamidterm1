package t2.sub;

import nikoloz_jintcharadze_2.midterm1.t2.chocolate.A21;
import nikoloz_jintcharadze_2.midterm1.t2.butter.performance.A22;

public class R21 {
    public static void main(String[] args) {
        A21 a21 = new A21();
        A22 a22 = new A22();
        
        int area = a21.getWidth() * a21.getHeight();
        System.out.println("Rectangle area: " + area);

        String monthName;
        switch (a22.getMonth()) {
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
            default -> monthName = "Invalid month";
        }
        System.out.println("Month: " + monthName);
    }
}