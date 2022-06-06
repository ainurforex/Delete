/*
Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
– Бананы – 5 штук (1 банан - 80 грамм);
– Молоко – 200 мл (100 мл = 105 грамм);
– Мороженое пломбир – 2 брикета по 100 грамм;
– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
Смешать всё в блендере и готово.
Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
Результат напечатайте в консоль.

 */
public class Main {
    public static void main(String[] args) {
        byte bananWeightGr=80;
        byte milkWeightGr=105;
        byte plombirWeightGr=100;
        byte eggWeightGr=70;
        float breakfastTotalWeightGr;
        float breakfastTotalWeightKg;
        breakfastTotalWeightGr=(bananWeightGr*5)+(milkWeightGr*2)+(plombirWeightGr*2)+(eggWeightGr*4);
        breakfastTotalWeightKg=breakfastTotalWeightGr/1000;
        System.out.println("Общий вес завтрака- "+breakfastTotalWeightKg+" кг.");
    }
}