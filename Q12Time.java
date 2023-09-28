public class Q12Time {
    public static void main(String[] args) {
        // Test cases
        int[][] times = {{9, 0}, {3, 0}, {18, 0}, {1, 0}, {2, 30}, {4, 41}};
        
        for (int[] time : times) {
            int hours = time[0];
            int minutes = time[1];
            int angle = calculateClockAngle(hours, minutes);
            System.out.println("Angle at " + hours + ":" + String.format("%02d", minutes) + " is " + angle + " degrees.");
        }
    }

    public static int calculateClockAngle(int hours, int minutes) {
        // Calculate the minute hand's angle
        int minuteAngle = minutes * 6;

        // Calculate the hour hand's angle
        int hourAngle = (hours % 12) * 30 + (minutes * 3 / 2);

        // Calculate the absolute difference between hour and minute hands
        int angle = Math.abs(hourAngle - minuteAngle);

        // Ensure the angle is between 0 and 359 degrees
        angle = angle % 360;

        return angle;
    }
}
