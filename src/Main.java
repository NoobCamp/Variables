//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte variable1 = 10;
        short variable2 = 32766;
        int variable3 = 2000000;
        long variable4 = 900000000L;
        float variable5 = 1.1f;
        double variable6 = 1.2;
        System.out.println("Значение переменной variable1 с типом byte равно " + variable1);
        System.out.println("Значение переменной variable2 с типом short равно " + variable2);
        System.out.println("Значение переменной variable3 с типом int равно " + variable3);
        System.out.println("Значение переменной variable4 с типом long равно " + variable4);
        System.out.println("Значение переменной variable5 с типом float равно " + variable5);
        System.out.println("Значение переменной variable6 с типом double равно " + variable6);

        System.out.println("Задание 2");
        float var1 = 27.12f;
        long var2 = 987678965549L;
        float var3 = 2.786f;
        short var4 = 569;
        int var5 = -159;
        double var6 = 27897;
        byte var7 = 67; // В задании не было указано вывести в консоль, только инициализировать переменные...
        // Хочется пошутить, что в тз не указано, значит не надо :D  но если что доработаю
        // var3 исправил запятую на точку, а в консоль надо выводить всё же или нет?

        System.out.println("Задание 3");
        byte lPetrovna = 23;
        byte aSergeevna = 27;
        byte eAndreevna = 30;
        int papers = 480 / (lPetrovna + aSergeevna + eAndreevna);
        System.out.println("На каждого ученика рассчитано " + papers + " листов бумаги");

        System.out.println("Задание 4");
        byte machineSpd = 8;
        byte minutes20 = 20;
        short day1 = 1440;
        int day3 = day1 * 3;
        int month1 = day1 * 30;
        System.out.println("За 20 минут машина произвела " + minutes20 * machineSpd + " штук бутылок");
        System.out.println("За сутки машина произвела " + day1 * machineSpd + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + day3 * machineSpd + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + month1 * machineSpd + " штук бутылок");

        System.out.println("Задание 5");
        byte all = 120;
        byte white = 2;
        byte brown = 4;
        int classes = all / (white + brown);
        System.out.println("В школе, где " + classes + " классов, нужно " + classes * white + " банок белой краски и " + classes * brown + " банок коричневой краски");

        System.out.println("Задание 6");
        byte banana = 5;
        float milk = 0.2f;
        byte iceCream = 2;
        byte eggs = 4;
        int bananaWeight = banana * 80;
        float milkWeight = milk * 1050;
        int iceCreamWeight = iceCream * 100;
        int eggsWeight = eggs * 70;
        float allWeight = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Общий вес в граммах: " + allWeight + ". Общий вес в кг: " + (allWeight / 1000));
        // Возможно не стоило молоко считать в литрах, а сразу в мл и не использовать float, чтоб экономить вес, но решил попробовать так.
        // Если что переделаю

        System.out.println("Задание 7");
        short needDrop = 7000;
        short ezDrop = 250;
        short hardDrop = 500;
        int ezDays = needDrop / ezDrop;
        int hardDays = needDrop / hardDrop;
        int average = (ezDays + hardDays) / 2;
        System.out.println("Если худеть по 250г в день, то нужно " + ezDays + " дней");
        System.out.println("Если худеть по 500г в день, то нужно " + hardDays + " дней");
        System.out.println("При средней нагрузке потребуется " + average + " день");

        System.out.println("Задание 8");
        float masha = 67760;
        float denis = 83690;
        float christina = 76230;
        masha =  masha * 1.1f;
        denis =  denis * 1.1f;
        christina =  christina * 1.1f;
        float mashaDif = masha % (masha / 1.1f);
        float denisDif = denis % (denis / 1.1f);
        float christinaDif = christina % (christina / 1.1f);
        System.out.println("Маша теперь получает " + masha + " рублей. Годовой доход вырос на " + mashaDif + " рублей");
        System.out.println("Денис теперь получает " + denis + " рублей. Годовой доход вырос на " + denisDif + " рублей");
        System.out.println("Кристина теперь получает " + christina + " рублей. Годовой доход вырос на " + christinaDif + " рублей");

    }
}