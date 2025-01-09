import java.util.Scanner;

class Bowler {
    // Instance variables
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    // Default constructor
    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    // Parameterized constructor
    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    // Method to compute and print the bowling average
    public void computeBowlingAverage() {
        if (hasInvalidValues()) {
            System.out.println("Error");
            return;
        }
        if (wickets == 0) {
            System.out.println("Error: Division by zero (no wickets taken).");
            return;
        }
        double bowlingAvg = (double) runsConceded / wickets;
        System.out.println("Name: " + name);
        System.out.printf("bowling_avg=%.1f%n", bowlingAvg);
    }

    // Method to print bowler statistics
    public void showStatistics() {
        if (hasInvalidValues()) {
            System.out.println("Error");
            return;
        }
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + ballsBowled);
        System.out.println("runs_conceded=" + runsConceded);
    }

    // Method to compute and print the strike rate
    public void computeStrikeRate() {
        if (hasInvalidValues()) {
            System.out.println("Error");
            return;
        }
        if (ballsBowled == 0) {
            System.out.println("Error: Division by zero (no balls bowled).");
            return;
        }
        double strikeRate = (double) runsConceded / ballsBowled;
        System.out.println("Name: " + name);
        System.out.printf("Strike_rate=%.8f%n", strikeRate);
    }

    // Helper method to check for invalid values
    private boolean hasInvalidValues() {
        return wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0 || 
               (matches == 0 && (runsConceded > 0 || ballsBowled > 0));
    }
}

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter bowler name:");
        String name = scanner.nextLine();
        System.out.println("Enter wickets:");
        int wickets = scanner.nextInt();
        System.out.println("Enter matches:");
        int matches = scanner.nextInt();
        System.out.println("Enter balls bowled:");
        int ballsBowled = scanner.nextInt();
        System.out.println("Enter runs conceded:");
        int runsConceded = scanner.nextInt();

        // Create a Bowler object using the parameterized constructor
        Bowler bowler = new Bowler(name, wickets, matches, ballsBowled, runsConceded);

        // Call methods to display statistics and compute averages
        bowler.showStatistics();
        bowler.computeBowlingAverage();
        bowler.computeStrikeRate();

        scanner.close();
    }
}

