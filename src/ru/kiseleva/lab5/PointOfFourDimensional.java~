package ru.kiseleva.lab5;

public class PointOfFourDimensional extends Point {

    private double x;
    private double y;
    private double z;
    private double t;

    public PointOfFourDimensional(int numberOfSpaces, double x, double y, double z, double t) {
        setName("Точка четырехмерного пространства");
        setNumberOfSpaces(numberOfSpaces);
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + ",  параметры: (" + x + "," + y + "," + z + "," + t + ")" + "кол-во параметров: " + this.numberOfVariables();
    }

    @Override
    public int numberOfVariables() {
        return numberOfSpaces;
    }

    @Override
    public boolean isLocateAxis() {
        return t == 0;
    }

    @Override
    public void summet() {
        this.x = -x;
        this.y = -y;
        this.z = -z;
        this.t = -t;
    }

    @Override
    public void transfer(Vektor p) {
        this.x += p.x1 - p.x0;
        this.y += p.y1 - p.y0;
        this.z += p.z1 - p.z0;
        this.t += p.t1 - p.t0;
    }
}
