public class Main {
    public static void main(String[]args)
    {
        Car c = new Electric(" Electric");
        c.type();
        c.speed(5000);
        System.out.println("\n");
        Car p = new petrol("Petrol");
        p.type();
        p.speed(8000);
    }
}