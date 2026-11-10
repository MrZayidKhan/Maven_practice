package maven.maven;

public class triangle {
    
    public double getArea(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be greater than zero.");
        }
        return 0.5 * base * height;
    }
}