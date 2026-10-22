/**
 *
 * @author ADMIN
 */
public class PrecedencePuzzleSolverWeek2 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        
        //Predicted: False
        System.out.println((a + b*2) > 5 && a < b + 3);
        
        //Predicted:13
        int c = 8;
        System.out.println(++c + 2*2);
        
        //Predicted True
        int d = 5;
        System.out.println(d++ > 4 || d*2 ==10 );
    }
    
}
