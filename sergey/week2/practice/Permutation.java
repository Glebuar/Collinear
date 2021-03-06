import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {
    public static void main(String[] args) {
        RandomizedQueue<String> rQ = new RandomizedQueue<>();
        int k = Integer.parseInt(args[0]);

        while (!StdIn.isEmpty()) {
            String tempString = StdIn.readString();
            rQ.enqueue(tempString);
        }


        while (!rQ.isEmpty() && k > 0) {
            StdOut.println(rQ.dequeue());
            k--;
        }
    }
}
