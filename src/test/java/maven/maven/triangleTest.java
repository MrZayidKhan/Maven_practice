package maven.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class triangleTest {

    @Test
    public void testGetAreaValidInputs() {
        triangle triangle = new triangle();
        double base = 10.0;
        double height = 5.0;
        
        double expectedArea = 25.0;
        double actualArea = triangle.getArea(base, height);
        
        // Using a delta (0.0001) for precise double/floating-point comparisons
        assertEquals(expectedArea, actualArea, 0.0001, "The calculated area is incorrect.");
    }

    @Test
    public void testGetAreaZeroBase() {
        triangle triangle = new triangle();
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            triangle.getArea(0.0, 5.0);
        });
        
        assertEquals("Base and height must be greater than zero.", exception.getMessage());
    }

    @Test
    public void testGetAreaNegativeHeight() {
        triangle triangle = new triangle();
        
        assertThrows(IllegalArgumentException.class, () -> {
            triangle.getArea(10.0, -2.0);
        });
    }
}