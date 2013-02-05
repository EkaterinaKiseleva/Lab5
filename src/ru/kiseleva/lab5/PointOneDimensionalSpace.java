package ru.kiseleva.lab5;

public class PointOneDimensionalSpace extends Point {

    private double x;

    public PointOneDimensionalSpace(int numberOfSpaces, double x) {
        setName("Точка одномерного пространства");
        setNumberOfSpaces(numberOfSpaces);
        this.x = x;
    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + ",  параметры: (" + x + ")" + "кол-во параметров: " + this.numberOfVariables();
    }

    @Override
    public int numberOfVariables() {
        return numberOfSpaces;
    }

    @Override
    public boolean isLocateAxis() {
        return x == 0;
    }

    @Override
    public void summet() {
        this.x = -x;
    }

    @Override
    public void transfer(Vektor p) {
        this.x += p.x1 - p.x0;
    }
}
