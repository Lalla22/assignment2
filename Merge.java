
/**
 * Merge two sorted lists into one sorted list.
 *
 * @author Lalla Sankara 
 * @version 10/29/2019
 */
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class Merge
{
    // Sample input
    public static int[] input1 = {1,3,5};
    public static int[] input2 = {2,4,5,6};

    public static void main (String [] args)
    {
      // Display Input1
      System.out.println("Input1\t" + Arrays.toString(input1));
        
     // Create empty queues
     Queue<Integer> queue1 = new LinkedList<Integer>();
     Queue<Integer> queue2 = new LinkedList<Integer>();
  
      for(int i=0; i<input1.length; i++){
      // One by one push all characters of string to queue.
      queue1.add(input1[i]);
      queue2.add(input2[i]);
      queue1.add(input2[i]);
     }
     
     // Save the input string
     String output = "";
     while(queue1.peek() != null ){
       //One by one pop all characters from stack and put them back to string.
       output += Integer.toString(queue1.poll());
       
     }
     
     // Display reversed as string array
     System.out.println("Output1\t" + Arrays.toString(output.split("")));

     
    }
    
}
