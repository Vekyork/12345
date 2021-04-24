package lesson1;

public class Compare {
    public static void main(String[] args) {
//    Задание 1.1
//    Приготовление чая:
//    Вскипятить чайник, налить заварку, положить сахар, размешать, дать остыть и настояться.
//    Задание 1.2
//    Написание кода:
//    Включить компьютер, запустить программу, написать алгоритм, написать код, скомпилировать.
//    Задания 1.3, 1.4

        Integer a = 1;//переменная примитивного типа
        Integer b = 2;
        String Dog1 = "Bars";//переменная ссылочного типа
        String Dog2 = "Boris";
        Animal Dog = new Animal("Собака", "Рыжик", 3);  //переменная класса Animal
//        System.out.println("Сравнение Cat1 и Cat2: " +Cat1.compareTo(Cat2));
        System.out.println("a= " +a);
        System.lineSeparator();
        System.out.println("b= " +b);
        System.lineSeparator();
        System.out.println("Dog1= " +Dog1);
        System.lineSeparator();
        System.out.println("Dog2= " +Dog2);
        System.lineSeparator();
        System.out.println("Сравнение Dog1 и Dog2: " + Dog1.equals(Dog2));
        System.lineSeparator();
        System.out.println("Сравнение a и b: " + a.compareTo(b));
        System.lineSeparator();
        int arr[] = { 4, 6, 7, 9, 12, 15 ,2, 45, 34 };

        long nano_startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            String strToPrint = "arr[" + i + "]=" + arr[i];
        }
        long nano_endTime = System.nanoTime() - nano_startTime;
        System.out.println("Время выполнения сравнения:" + nano_endTime);
    }
}