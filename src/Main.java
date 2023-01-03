import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        System.out.println("Задача 1");
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать. ");
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        byte t = 4;
        if (t < 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        if (t > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        int speed = 56;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        }
    }

    private static void task4() {
        System.out.println("Задача 4");
        byte age = 15;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        int age = 1;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттаркционе.");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то можно  кататься на аттаркционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься на аттаркционе без сопровождения взрослого.");
        }
    }

    private static void task6() {
        System.out.println("Задача 6");
        int mestoSid = 31;
        int mestoStand = 42;
        if ((mestoStand + mestoSid) >= 102) {
            System.out.println("Свободных мест нет.");
        } else if (mestoSid < 60 || mestoStand < 42) {
            System.out.println(" Есть " + (60 - mestoSid) + " сидячих мест и " + (42 - mestoStand) + " стоячих мест");
        }
    }

    private static void task7() {
        System.out.println(" Задача 7");
        int one = 9850;
        int two = 6000;
        int three = 6000;
        if ((one > two && one > three) || (two == three && one > two)) {
            System.out.println(one);
            }
        else if ((one < two && two > three) || (one == three && two > one)) {
            System.out.println(two);
        }
        else if ((one < two && two < three) || (one == two && two < three)) {
            System.out.println(three);
        }
        }

    }


