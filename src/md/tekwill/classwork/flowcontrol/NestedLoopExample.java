package md.tekwill.classwork.flowcontrol;

public class NestedLoopExample {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; ++hour) {
            for (int minute = 0; minute < 60; ++minute) {
                for (int second = 0; second < 60; ++second) {
                    String formattedHour = hour < 10 ? "0" + hour : String.valueOf(hour);
                    System.out.println(formattedHour + ":" + minute + ":" + second);
                }
            }
        }
    }
}
