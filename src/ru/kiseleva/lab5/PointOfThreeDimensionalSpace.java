package ru.kiseleva.lab5;

public class PointOfThreeDimensionalSpace extends Point {

    private double x;
    private double y;
    private double z;

    public PointOfThreeDimensionalSpace(int numberOfSpaces, double x, double y, double z) {
        setName("Точка трехмерного пространства");
        setNumberOfSpaces(numberOfSpaces);
        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + ",  параметры: (" + x + "," + y + "," + z + ")" + "кол-во параметров: " + this.numberOfVariables();
    }

    @Override
    public int numberOfVariables() {
        return numberOfSpaces;
    }

    @Override
    public boolean isLocateAxis() {
        return z == 0;
    }

    @Override
    public void summet() {
        this.x = -x;
        this.y = -y;
        this.z = -z;
    }

    @Override
    public void transfer(Vektor p) {
        this.x += p.x1 - p.x0;
        this.y += p.y1 - p.y0;
        this.z += p.z1 - p.z0;
    }
}
