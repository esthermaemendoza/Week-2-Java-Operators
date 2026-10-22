/**
 *
 * @author ADMIN
 */
public class CompoundGrowthAndIncrementTrackerWeek2 {
     public static void main(String[] args) {
        
        double bal = 10000;
        
        System.out.println("Initial Balance" + bal);
        
        bal += 300;
        
        System.out.println("After adding 300: " + bal);
        
        bal *= 1.50;
        System.out.println("After 50% growth" + bal);
        
        bal += 600;
        System.out.println("After adding 600" + bal);
        
        int count = 5;
        
        System.out.println("\nPostfix Increment");
        // count++ uses the current value (5) for the print statement FIRST, 
        // then increments count to 6 afterward.
        System.out.println(count++);
        System.out.println(count);
        
        System.out.println("\nPrefix Increment");
        // ++count increments count FIRST (to 7), then uses the new value 
        // for the print statement.
        System.out.println(count++);
        System.out.println(count);
        
    }
    
}
