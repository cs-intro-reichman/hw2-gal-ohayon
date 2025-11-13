public class TimeCalc {
    public static void main(String[] args) {
        // Step 1: Read inputs
        String time = args[0]; // e.g. "10:30"
        int minutesToAdd = Integer.parseInt(args[1]); // e.g. 4055

        // Step 2: Split the time string
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        // Step 3: Convert everything to total minutes
        int totalMinutes = hours * 60 + minutes + minutesToAdd;

        // Step 4: Compute new hours and minutes
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        // Step 5: Print formatted time with leading zeros
        System.out.printf("%02d:%02d\n", newHours, newMinutes);
    }
}
