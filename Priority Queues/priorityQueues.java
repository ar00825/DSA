import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueues {
    
    public static void main(String[] args) {
        
        // PRIORITY QUEUES -> FIFO data structure
        //                 -> ranks elements based on their priority
        //                 -> elements with higher priority are served first before elements with lower priority


        Queue<Double> testScores = new PriorityQueue<>();

        // Ranks the test scores in ascending order (smallest -> largest)
        testScores.offer(90.0);
        testScores.offer(55.0);
        testScores.offer(81.0);
        testScores.offer(22.0);
        testScores.offer(68.0);
        
        System.out.println("Test Scores: " + testScores);

    }
}
