package Home_Work;

//Home Work: Analyze Scores
//Date: 4/27/2026
//Programmer: SirAndrae Thomas

public class HW1_Analyze_Scores
 {

	public static void main(String[] args) {
	      int[] scores = new int[100];

	        // Generate random scores (0–99)
	        for (int i = 0; i < scores.length; i++) {
	            scores[i] = (int)(Math.random() * 100);
	        }

	        // Display scores
	        displayScores(scores);

	        // Calculate average
	        double avg = average(scores);
	        System.out.printf("\nAverage Scores: %.2f\n", avg);

	        // Count above average
	        int countAbove = countAboveAverage(scores, avg);
	        System.out.println("Above average Scores: " + countAbove);

	        // Count ranges
	        countRanges(scores);
	    }

	    // Display 10 per line
	    public static void displayScores(int[] scores) {
	        System.out.println("Scores:");
	        for (int i = 0; i < scores.length; i++) {
	            System.out.printf("%3d ", scores[i]);

	            if ((i + 1) % 10 == 0) {
	                System.out.println();
	            }
	        }
	    }

	    // Compute average
	    public static double average(int[] scores) {
	        int sum = 0;
	        for (int s : scores) {
	            sum += s;
	        }
	        return (double) sum / scores.length;
	    }

	    // Count scores >= average
	    public static int countAboveAverage(int[] scores, double avg) {
	        int count = 0;
	        for (int s : scores) {
	            if (s >= avg) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Count ranges
	    public static void countRanges(int[] scores) {
	        int[] ranges = new int[10]; // 0–9, 10–19, ..., 90–99

	        for (int s : scores) {
	            ranges[s / 10]++;
	        }

	        System.out.println("\nCounts of scores in each range:");
	        for (int i = 0; i < ranges.length; i++) {
	            System.out.println((i * 10) + "--" + (i * 10 + 9) + " : " + ranges[i]);
	        }
	    }
	}

