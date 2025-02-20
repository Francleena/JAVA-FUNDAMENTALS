
class Car {
    private String brand;

    public Car() {
        this.brand = "Unknown";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void display() {
        System.out.println("Car Brand: " + brand);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display(); 

        myCar.setBrand("Toyota");
        myCar.display(); 
    }
}
