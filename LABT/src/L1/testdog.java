package L1;

import java.lang.*;
public class testdog {
    public static void main(String[] args) {
        dog d1 = new dog("Pet", 1);
        dog d2 = new dog("Rayn", 5);
        dog d3 = new dog("Ken");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
