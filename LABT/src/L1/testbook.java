package L1;

import java.lang.*;
public class testbook {
    public static void main(String[] args) {
        book b1 = new book(28, "green");
        System.out.println("Pages "+ b1.getPage()
                +" color is " + b1.getColor());

        book b2 = new book(14);
        System.out.println("Pages " + b2.getPage()
                + " color is " + b2.getColor());

        book b3 = new book(21 , "white");
        System.out.println("Pages " + b3.getPage()
                +" color is " + b3.getColor());
    }
}

