

// Задача - посчитать сумму чисел a и b таких, что -32000<a<32000  и -32000<b<32000.
// Первый мой код за 9 лет, написан по остаточному со школы знанию паскаля и по wiki-учебнику Java. Время - 1,5 часа.

import java.util.Scanner;

    public class Mary {

        public static void main(String[] args) {

            short a,b;
            int c;

            System.out.print("Здравствуйте, введите число a = ");
            Scanner x = new Scanner(System.in);
            a = x.nextShort();

            System.out.print("введите число b = ");
            Scanner y = new Scanner(System.in);
            b = y.nextShort();

            c = (int) a + b;

            System.out.println ("Сумма чисел a и b = " + c);
        }
    }
