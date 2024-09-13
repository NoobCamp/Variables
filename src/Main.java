//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var fighter1 = 78.2;
        var fighter2 = 82.7;
        System.out.println(fighter1 + fighter2);
        var weightDifference = fighter2 - fighter1;
        System.out.println(weightDifference);

        System.out.println("Задание 7");
        var remainderOfIntegerDivison = fighter2 % fighter1;
        System.out.println(remainderOfIntegerDivison);

        System.out.println("Задание 8");
        var hours = 640;
        var shift = 8;
        var employees = hours / shift;
        System.out.println("Всего работников в компании — " + employees + "человек");
        var moreEmployees = employees + 94;
        System.out.println("Если в компании работает " + moreEmployees + " человека, то всего " + moreEmployees * 8 + " часа работы может быть поделено между сотрудниками");
        // было бы хорошо узнать, как можно составить код красивее, потому что сейчас оно идёт всё в ряд и сливается, а идей, кроме как поочередно использовать var и System.out.println у меня не появилось

    }
}