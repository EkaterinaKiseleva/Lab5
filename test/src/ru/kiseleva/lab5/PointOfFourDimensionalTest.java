package ru.kiseleva.lab5;
import org.junit.Test;
import ru.kiseleva.lab5.PointOfFourDimensional;

import static org.junit.Assert.*;
public class PointOfFourDimensionalTest {

    @Test
    public void testNumberOfVariables() {
        System.out.println("Проверка метода numberOfVariables()");
        PointOfFourDimensional p = new PointOfFourDimensional(4, 3, 4, 2, 6);
        assertEquals(4, p.numberOfVariables(), 0.00001);

    }
    @Test
    public void testIsLocateAxis() {
        System.out.println("Проверка метода isLocateAxis()");
        PointOfFourDimensional p = new PointOfFourDimensional(4, 3, 4, 2, 6);
        assertEquals(false, p.isLocateAxis());

    }


}
