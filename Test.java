public class Test {
    public static void main(String[] args) {
        
        // Array of size 8 with zero-based indexing (0 to 7)
        Player[] player = new Player[8];
        player[0] = new Player("1001", "Chin", 98.5);
        player[1] = new Player("1002", "porman", 23.2);
        player[2] = new Player("1003", "ando", 41.5);
        player[3] = new Player("1004", "melody", 23.5);
        player[4] = new Player("1005", "wewe", 12.5);
        player[5] = new Player("1006", "wowo", 93.5);
        player[6] = new Player("1007", "angkol", 91.5);
        player[7] = new Player("1008", "katol", 92.5);
        
        System.out.println("=== Before Sorting ===");
        // Use printf for formatted output
        System.out.printf("%-10s %-15s %-10s%n", "ID", "Name", "Score");
        System.out.println("----------------------------------------");
        
        for (Player p : player) {
            System.out.printf("%-10s %-15s %-10.1f%n", p.getId(), p.getName(), p.getScore());
        }
    }
}