package ru.kiseleva.lab5;

public abstract class Point implements Summetry, TranslationByVektor {

    int numberOfSpaces;
    private String name;
    private int id;
    static int nextId = 1;

    public abstract boolean isLocateAxis();

    public abstract int numberOfVariables();

    {
        id = nextId++;
    }
    private boolean sortUp = false;
    private int sortMode = 0;

    public void setNumberOfSpaces(int numberOfSpaces) {
        this.numberOfSpaces = numberOfSpaces;
    }

    public int getNumberOfSpaces() {
        return numberOfSpaces;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setSortMode(int sortMode) {
        this.sortMode = sortMode;
    }

    public int getSortMode() {
        return sortMode;
    }

    public void setSortUp(boolean sortUp) {
        this.sortUp = sortUp;
    }
}
