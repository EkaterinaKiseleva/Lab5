package ru.kiseleva.lab5;
import org.junit.Test;
import ru.kiseleva.lab5.PointOfTwoDimensionalSpace;

import static org.junit.Assert.*;
public class PointOfTwoDimensionalSpaceTest {

    @Test
    public void testNumberOfVariables() {
        System.out.println("Проверка метода numberOfVariables()");
        PointOfTwoDimensionalSpace p = new PointOfTwoDimensionalSpace(2, 3, 4);
        assertEquals(2, p.numberOfVariables(), 0.00001);

    }
    @Test
    public void testIsLocateAxis() {
        System.out.println("Проверка метода isLocateAxis()");
        PointOfTwoDimensionalSpace p = new PointOfTwoDimensionalSpace(2, 3, 4);
        assertEquals(false, p.isLocateAxis());

    }


}
