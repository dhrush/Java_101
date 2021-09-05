package Conditionals;

public class SwitchCase {
    public static void main(String[] args) {
        /*
         * int day = 6; String dayName;
         * 
         * switch (day) { case 0: dayName = "Sundae"; break;
         * 
         * case 1: dayName = "Monday"; break;
         * 
         * case 2: dayName = "Tuesday"; break;
         * 
         * case 3: dayName = "Wednesday"; break;
         * 
         * case 4: dayName = "Thursday"; break;
         * 
         * case 5: dayName = "Friday"; break;
         * 
         * case 6: dayName = "Saturday"; break;
         * 
         * default: dayName = "Unknown Day on Earth"; break; }
         * 
         * System.out.println("Day is: " + dayName);
         */

        int month = 1;
        int noOfDays = 30;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                noOfDays = 31;
                break;
            case 2:
                noOfDays = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                noOfDays = 30;
        }

        System.out.println("Days in the " + month + "st month are: " + noOfDays);
    }
}
