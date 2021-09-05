package Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String location = "Florida";
        int flightNum = 175;
        StringBuilder sb = new StringBuilder(40); // 40 is the size of buffer passing size improves performance
                                                  // StringBuilder sb = new StringBuilder() also works
        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on flight #");
        sb.append(flightNum);

        String message = sb.toString();

        String time = "9:00 am";
        int pos = sb.indexOf(" on ");
        sb.insert(pos, " at ");
        sb.insert(pos + 4, time);
        message = sb.toString();
        System.out.println(message);
    }
}
