public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat -1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        System.out.println("Вес первого боксера " + weightBoxer1 + "кг");
        var weightBoxer2 = 82.7;
        System.out.println("Вес второго боксера " + weightBoxer2 + "кг");
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес двух боксеров = " + totalWeight + "кг");
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе двух боксеров = " + weightDifference + "кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightDifference1 = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе двух боксеров (1 способ) - " + weightDifference1 + "кг");
        var weightDifference2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница в весе двух боксеров (2 способ) - " + weightDifference2 + "кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");

        var totalNumberOfHours = 640;
        var workOfOneEmployee = 8;
        var numberOfEmployees = totalNumberOfHours / workOfOneEmployee;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек.");
        numberOfEmployees = numberOfEmployees + 94;
        totalNumberOfHours = numberOfEmployees * workOfOneEmployee;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + totalNumberOfHours + " часов работы может быть поделено между сотрудниками.");
    }


    }