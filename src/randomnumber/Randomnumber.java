
package randomnumber;
/**
 *
 * @author Bhavik
 */
//import the Random class library
import java.util.Random;
public class Randomnumber {

   
    public static void main(String[] args) {
        Random r = new Random();
        int a = Math.abs(r.nextInt());
        System.out.println(a);
    }
    
}
