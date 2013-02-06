//Выполнила студентка группы ИВТ-01 Киселева Екатерина
package ru.kiseleva.lab5;

import java.io.*;
import java.util.*;

public class Lab5 {

    private static List<Point> list;

    private static void init() { // создание и заполнение списка
        list = new ArrayList<>();
        list.add(new PointOneDimensionalSpace(1, -1));
        list.add(new PointOneDimensionalSpace(1, 5));
        list.add(new PointOneDimensionalSpace(1, 3));
        list.add(new PointOfTwoDimensionalSpace(2, 5, 4));
        list.add(new PointOfTwoDimensionalSpace(2, 2, -8));
        list.add(new PointOfTwoDimensionalSpace(2, 2, 4));
        list.add(new PointOfThreeDimensionalSpace(3, -1, 8, 4));
        list.add(new PointOfThreeDimensionalSpace(3, 1, 4, 1));
        list.add(new PointOfThreeDimensionalSpace(3, 1, 7, 2));
        list.add(new PointOfFourDimensional(4, 6, 1, 8, 5));
        list.add(new PointOfFourDimensional(4, 6, 5, 4, 2));
        list.add(new PointOfFourDimensional(4, 6, -4, 3, 1));
    }

    public static void main(String[] args) throws IOException {
        init();
        InputStreamReader isr = new InputStreamReader(System.in);// подготовка к вводу
        BufferedReader br = new BufferedReader(isr);
        for (;;) { // начинаем бесконечный цикл
            System.out.println();
            System.out.println("Выберите тип сортировки (выйти - пустая строка):");
            System.out.println("--------------------------------------------------");
            System.out.println("1 - по возраcтанию id");
            System.out.println("2 - по убыванию id");
            System.out.println("3 - по возраcтанию имени");
            System.out.println("4 - по убыванию имени");
            System.out.println("5 - по возрастанию кол-ва параметров");
            System.out.println("6 - по убыванию кол-ва параметров");
            System.out.println("7 - лежат ли точки:\nодномерного пространства на оси ОХ"
                    + "\nдвумерного пространства на оси ОУ"
                    + "\nтрехмерного пространства на оси ОZ"
                    + "\nчетырехмерного пространства на оси OT?");
            System.out.println("8 - симметрия точки относительно начала координат");
            System.out.println("9 - перенос точки на заданный вектор");
            System.out.println("--------------------------------------------------");

            String mode = br.readLine(); // читаем строку из буфера ввода
            if (mode.isEmpty()) {
                break; // прерываем цикл, если строка пустая
            }
            boolean sortUp = false;
            int sortMode = 0;


            switch (mode) {
                case "1": {
                    sortUp = false;
                    sortMode = 0;
                    break;
                }
                case "2": {
                    sortUp = true;
                    sortMode = 0;
                    break;
                }
                case "3": {
                    sortUp = false;
                    sortMode = 1;
                    break;
                }
                case "4": {
                    sortUp = true;
                    sortMode = 1;
                    break;
                }
                case "5": {
                    sortUp = false;
                    sortMode = 2;
                    break;
                }
                case "6": {
                    sortUp = true;
                    sortMode = 2;
                    break;
                }
                case "7": {
                    for (int i = 0; i < 12; i++) {
                        Point e = (Point) list.get(i);
                        String s1 = " проходит через заданную плоскость";
                        if (!e.isLocateAxis()) {
                            s1 = "не" + s1;
                        }
                        System.out.println(list.get(i).toString() + "," + s1);
                    }
                    break;
                }
                case "8": {
                    for (int i = 0; i < 11; i++) {
                        Point e = (Point) list.get(i);
                        e.summet();
                    }
                    break;
                }
                case "9": {
                    System.out.println("Введите начальные и конечные координаты вектора x0, x1, y0, y1, z0, z1, t0, t1 через Enter");
                    Scanner sc = new Scanner(System.in);
                    double x0 = sc.nextDouble();
                    double x1 = sc.nextDouble();
                    double y0 = sc.nextDouble();
                    double y1 = sc.nextDouble();
                    double z0 = sc.nextDouble();
                    double z1 = sc.nextDouble();
                    double t0 = sc.nextDouble();
                    double t1 = sc.nextDouble();
                    Vektor p = new Vektor(x0, x1, y0, y1, z0, z1, t0, t1);
                    for (int i = 0; i < 12; i++) {
                        Point e = (Point) list.get(i);

                        e.transfer(p);
                    }
                    break;
                }
            }

            if (!"7".equals(mode)) {
                Collections.sort(list, new SortMode(sortUp, sortMode));
                for (Point p : list) {
                    System.out.println(p);
                }
            }
        }
    }
}
