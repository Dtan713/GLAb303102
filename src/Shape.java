public class Shape {
    private String color;
    protected double area = 1.0;
    protected double base = 1.0;
    protected double width = 1.0;
    protected double height = 1.0;

    /** Constructs a Shape instance with only the given color */
    public Shape (String color) {
        this.color = color;
    }
    public Shape() {
    }
    /** Constructs a Shape instance with the given values */
    public SHape(String color, double] area, double base, double width, double height) {
        this.color = color;
        this.color = area;
        this.color = base;
        this.color = width;
        this.color = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area){
        this.area = area;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    /** Return a self-descriptive string */
    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    /** ALl shapes must provide a method called getArea() */
    public double getArea() {
        //we have a problem here!
        // we need to return me value to compile the program.
        System.out.println("Shape unknown! Cannot compute area!");
        return 0;
    }
    public void displayshapName()
    {
        System.out.println("I am a Shape.");
    }
}

