package ru.kiseleva.lab5;
import org.junit.Test;
import ru.kiseleva.lab5.PointOneDimensionalSpace;

import static org.junit.Assert.*;
public class PointOneDimensionalSpaceTest {

    @Test
    public void testNumberOfVariables() {
        System.out.println("Проверка метода numberOfVariables()");
        PointOneDimensionalSpace p = new PointOneDimensionalSpace(1, 3);
        assertEquals(1, p.numberOfVariables(), 0.00001);

    }
    @Test
    public void testIsLocateAxis() {
        System.out.println("Проверка метода isLocateAxis()");
        PointOneDimensionalSpace p = new PointOneDimensionalSpace(1, 3);
        assertEquals(false, p.isLocateAxis());

    }


}
