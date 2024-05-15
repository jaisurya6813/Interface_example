public class petrol implements Car{
    String name;

    public petrol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speed(int rpm) {
        System.out.println("The speed of the car is "+rpm);
    }

    @Override
    public void type() {
        System.out.println("This is an "+ this.name +" car");
    }
}
