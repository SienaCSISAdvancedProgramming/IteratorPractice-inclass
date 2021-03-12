import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

/**
 * In-class practice for working with Iterators.
 *
 * @author Jim Teresco, Completed by:
 * @version Spring 2021
 */
public class IteratorPractice
{
    public static void main(String args[]) {
        
        // create a couple of lists that we can work with to practice with
        // our iterators
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i <= 20; i++) {
            a.add(i);
        }
        
        List<String> b = new LinkedList<String>();
        b.add("my");
        b.add("favorite");
        b.add("part");
        b.add("of");
        b.add("Java");
        b.add("is");
        b.add("probably");
        b.add("iterators");
        
        // the built-in iterators (yes, we could also use an enhanced
        // for loop, but let's see the full Iterator functionality)
        System.out.println("a by the built-in iterator:");
        Iterator<Integer> aIter = a.iterator();
        while (aIter.hasNext()) {
            System.out.print(aIter.next() + " ");
        }
        System.out.println();
    
        System.out.println("b by the built-in iterator:");
        Iterator<String> bIter = b.iterator();
        while (bIter.hasNext()) {
            System.out.print(bIter.next() + " ");
        }
        System.out.println();
    }
}
