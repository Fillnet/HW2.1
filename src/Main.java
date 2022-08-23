public class Main {
    public  Main() {
            }
    public static void main(String[] args){
        byte a = 1;
        short b = 2345;
        int c = 23342342;
        long d = 4535336474746L;
        float e =1.343f;
        double f = 1.456756456;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;
        float summaryWeightBoxers = weightSecondBoxer + weightFirstBoxer;
        float differenceWeightBoxers = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Вес первого бойца " + weightFirstBoxer + " кг");
        System.out.println("Вес второго бойца " + weightSecondBoxer + " кг");
        System.out.println("Общий вес двух бойцов " + summaryWeightBoxers + " кг");
        System.out.println("Раница между весами бойцов " + differenceWeightBoxers + " кг");

        short bananas = 80;
        short milk = 105;
        short iceCream = 100;
        short eggs = 70;
        int breakFast = 5 * bananas + 2 * milk + 2 * iceCream + 4 * eggs;
        System.out.println("Вес завтрака в граммах " + breakFast);

        float breakFastKilograms = breakFast / 1000f;
        System.out.println("Вес завтрака в килограммах " + breakFastKilograms);


        byte excessWeightKilograms = 7;
        int excessWeightGram = excessWeightKilograms * 1000;
        int badLostWeight = 250;
        int goodLostWeight = 500;
        int goodDayLostWeight = excessWeightGram / goodLostWeight;
        int badDayLostWeight = excessWeightGram / badLostWeight;
        int averageLostDayWeight = (goodDayLostWeight + badDayLostWeight) / 2;
        System.out.println("Нужно похудеть на " + excessWeightKilograms + " кг");
        System.out.println("Нужно похудеть на " + excessWeightGram + " г");
        System.out.println("Количество дней при похудении на 500г: " + goodDayLostWeight + " дней");
        System.out.println("Количество дней при похудении на 250г: " + badDayLostWeight + " дней");
        System.out.println("Среднее количество дней для похудения: " + averageLostDayWeight + " день");

        int salaryOldMasha = 67760;
        int salaryOldDenis = 83690;
        int salaryOldKristina = 76230;
        int salaryNewMasha = (int) (salaryOldMasha * 0.1 + salaryOldMasha);
        int salaryNewDenis = (int) (salaryOldDenis * 0.1 + salaryOldDenis);
        int salaryNewKristina = (int) (salaryOldKristina * 0.1 + salaryOldKristina);
        int year = 12;
        int salaryOldMashaYear = salaryOldMasha * year;
        int salaryOldDenisYear = salaryOldDenis * year;
        int salaryOldKristinaYear = salaryOldKristina * year;

        int salaryNewMashaYear = salaryNewMasha * year;
        int salaryNewDenisYear = salaryNewDenis * year;
        int salaryNewKristinaYear = salaryNewKristina * year;

        int salaryDifferenceMasha = salaryNewMashaYear - salaryOldMashaYear;
        int salaryDifferenceDenis = salaryNewDenisYear - salaryOldDenisYear;
        int salaryDifferenceKristina = salaryNewKristinaYear - salaryOldKristinaYear;

        System.out.println("Зарплата Маши " + salaryOldMasha + " рублей");
        System.out.println("Зарплата Дениса " + salaryOldDenis + " рублей");
        System.out.println("Зарплата Кристины " + salaryOldKristina + " рублей");

        System.out.println("Новая Зарплата Маши " + salaryNewMasha + " рублей");
        System.out.println("Новая Зарплата Дениса " + salaryNewDenis + " рублей");
        System.out.println("Новая Зарплата Кристины " + salaryNewKristina + " рублей");

        System.out.println("Раньше Маша получала за год  " + salaryOldMashaYear + " рублей");
        System.out.println("Раньше Денис получал за год  " + salaryOldDenisYear + " рублей");
        System.out.println("Раньше Кристина получала за год  " + salaryOldKristinaYear + " рублей");

        System.out.println("Маша теперь получает " + salaryNewMashaYear + " рублей" + " Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryNewDenisYear + " рублей" + " Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryNewKristinaYear + " рублей" + " Годовой доход вырос на " + salaryDifferenceKristina + " рублей");




    }
}