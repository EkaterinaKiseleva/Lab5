package ru.kiseleva.lab5;
import org.junit.Test;
import ru.kiseleva.lab5.PointOfThreeDimensionalSpace;

import static org.junit.Assert.*;
public class PointOfThreeDimensionalSpaceTest {

    @Test
    public void testNumberOfVariables() {
        System.out.println("Проверка метода numberOfVariables()");
        PointOfThreeDimensionalSpace p = new PointOfThreeDimensionalSpace(3, 3, 4, 2);
        assertEquals(3, p.numberOfVariables(), 0.00001);

    }
    @Test
    public void testIsLocateAxis() {
        System.out.println("Проверка метода isLocateAxis()");
        PointOfThreeDimensionalSpace p = new PointOfThreeDimensionalSpace(3, 3, 4, 2);
        assertEquals(false, p.isLocateAxis());

    }


}
