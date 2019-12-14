package L6;

public class testCar {
    public static void main(String[] args) {
        Car c1 = new Car("kia", "ceed", "md", 600000, 2016);
        Car c2 = new Car("Nissan", "x-trail", "Cross", 1500000, 2017);
        Car c3 = new Car("Ford", "Mondeo", "Standart", 230000, 1111);
        c1.println();
        c2.println();
        c3.println();
    }
}
