
package lab6;
import java.util.Scanner;

class horse {
    protected String name;

    public horse() {
        name = Lab6.getIn(
            "The name of the horse: ",
            "\\w{3,}", 
            "Invalid name! Try again..."
        );
    }
}
class pegas extends horse {

    public void fly() {
        System.out.println("It is awesome  " + name + " the horse can fly...");
    }
}


public class Lab6 {

    private Lab6() {
        throw new AssertionError();
    }

    public static Scanner sc = new Scanner(System.in);

    public static String getIn(String help, String ptrn, String invalid) {
        System.out.println(help);

        while (!sc.hasNext(ptrn)){
            sc.next();
            System.out.println(invalid);
        }
        return sc.next();
    }
    
   
    public static void main(String[] args) {
        
        pegas p = new pegas();
        p.fly();
        
    }
    
    
}