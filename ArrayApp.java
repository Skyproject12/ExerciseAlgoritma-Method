import java.util.Scanner;

public class ArrayApp {

    // method procedures
    public static void println(String statement) {
          System.out.println(statement); 
     }
    public static void print(String statement) {
           System.out.print(statement); 
    }
    
    public static void displayScore(int[] _arrScores) {
        for(int i = 0; i < _arrScores.length; i++) {
            println("Score " + (i + 1) + " : " + _arrScores[i]);
        }
    }
    
    // method functions
    public static int totalScore(int[] _arrScores) {
        int total = 0;
        for(int i = 0; i < _arrScores.length; i++) {
            total = total + _arrScores[i];
        }

        return total;
    }

    public static int averageScore(int _totalScore, int _numbersOfScores) {
        return (_totalScore / _numbersOfScores);
    }

    public static int findMax(int[] _arrScores) {
        int max = 0;
        max = _arrScores[0];
        for(int i = 1; i < _arrScores.length; i++) {
            if(max < _arrScores[i]) {
                max = _arrScores[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        println("Students Programming Comparison");    
        println("================================");
        
        print("Name : ");
        String name = in.nextLine();
        print("ID : ");
        String id = in.nextLine();
        print("Enter numbers of score : ");
        int numbersOfScore = in.nextInt();
   
        int[] arrScores = new int[numbersOfScore];
        
        for(int i = 0; i < numbersOfScore; i++) {
            print("Enter score " + (i + 1) + " : ");
            arrScores[i] = in.nextInt();
        }
        
        println("================================");

        println("Name \t\t : " + name);
        println("ID \t\t : " + id);

        // call method procedure to display scores, the data is from arrScores
        displayScore(arrScores);

        // display total score
        println("Total inputted score : " + numbersOfScore);
        
        // call a function to get total score and average score
        int total = totalScore(arrScores);
        println("Total score : " + total);
        
        int average = averageScore(total, numbersOfScore);
        println("Average score : " + average);

        // call a function to get max number
        int maxScore = findMax(arrScores);
        println("Maximum : " + maxScore);  

    }
    
}