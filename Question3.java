public class Question3 {
    public static void main(String [] args){
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        int currentSecond = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        int currentMinute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        int currentHour = (int) (totalHours % 24);

        String result = String.format("Current time is %2d:%2d:%2d GMT", currentHour, currentMinute, currentSecond);
        System.out.print(result);
    }
}
