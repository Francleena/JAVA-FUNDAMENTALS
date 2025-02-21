class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    Rectangle(Rectangle rect) {
        this.length = rect.length;
        this.width = rect.width;
    }

    void display() {
        System.out.print("Length: " + length);
        System.out.print(" ");
        System.out.println("Width: " + width);
    }


    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 5);
        System.out.println("Original Rectangle:");
        rect1.display();

        Rectangle rect2 = new Rectangle(rect1);
        System.out.println("\nCopied Rectangle:");
        rect2.display();
    }
}