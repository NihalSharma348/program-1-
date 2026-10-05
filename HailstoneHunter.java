public class HailstoneHunter {
    public static void main(String[] args) {
        int bestStart = 1, bestSteps = 0;
        for (int start = 1; start < 10000; start++) {
            long n = start;
            int steps = 0;
            while (n != 1) {
                n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
                steps++;
            }
            if (steps > bestSteps) { bestSteps = steps; bestStart = start; }
        }
        System.out.println("Longest hailstone under 10000 starts at " + bestStart
                + " and takes " + bestSteps + " steps to fall to 1.");
    }
}
