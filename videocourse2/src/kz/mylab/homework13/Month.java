package kz.mylab.homework13;

public class Month {

    void showDaysOfMonth(int monthNumb) {
        switch (monthNumb) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("this month has 30 days");
                break;
            case 2:
                System.out.println("This month has 28 days");
                break;
            default:
                System.out.println("you input wrong number of month");
        }
    }

    public static void main(String[] args) {
        Month m=new Month();
        m.showDaysOfMonth(2);
    }
}
