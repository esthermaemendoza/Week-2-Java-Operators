/**
 *
 * @author ADMIN
 */
public class GradeThresholdCheckerWeek2 {
    public static void main(String[] args) {
        
        double ave = 75;
        int absences = 3;
        
        boolean passed = (ave >= 75 && absences <= 3) || (ave >= 90);
                
        System.out.println("Grade Threshold Checker");
        System.out.println("Average Grade: " + ave);
        System.out.println("Number of Abscenes: " + absences);
        
        System.out.println("Result: " + (passed ? "PASS" : "FAIL"));
        
        System.out.print("Reasoning: ");
        if (ave >= 90) {
            System.out.println("Excellent");
        } else if (ave >= 75 && absences <= 3) {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }
    }
    
}
