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



    }
}