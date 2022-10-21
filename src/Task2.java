import java.util.Arrays;
import java.util.Objects;

public class Task2 {
    // метод для выода результатов работы всех функций
    public static void main(String[] args) {
        System.out.println("task N1");
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 1));
        System.out.println();

        int[] array1 = {10, 4, 1, 4, -10, -50, 32, 21};
        int[] array2 = {44, 32, 86, 19};
        System.out.println("task N2");
        System.out.println(differenceMaxMin(array1));
        System.out.println(differenceMaxMin(array2));
        System.out.println();

        int[] array3 = {1, 3};
        int[] array4 = {1, 2, 3, 4};
        int[] array5 = {1, 5, 6};
        int[] array6 = {1, 1, 1};
        int[] array7 = {9, 2, 2, 5};
        System.out.println("task N3");
        System.out.println(isAvgWhole(array3));
        System.out.println(isAvgWhole(array4));
        System.out.println(isAvgWhole(array5));
        System.out.println(isAvgWhole(array6));
        System.out.println(isAvgWhole(array7));
        System.out.println();

        int[] array8 = {1, 2, 3};
        int[] array9 = {1, -2, 3};
        int[] array10 = {3, 3, -2, 408, 3, 3};
        System.out.println("task N4");
        System.out.println(Arrays.toString(cumulativeSum(array8)));
        System.out.println(Arrays.toString(cumulativeSum(array9)));
        System.out.println(Arrays.toString(cumulativeSum(array10)));
        System.out.println();

        System.out.println("task N5");
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
        System.out.println();

        System.out.println("task N6");
        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(7));
        System.out.println(Fibonacci(12));
        System.out.println();

        System.out.println("task N7");
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));
        System.out.println();

        System.out.println("task N8");
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));
        System.out.println();

        System.out.println("task N9");
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));
        System.out.println();

        System.out.println("task N10");
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
    }

    // повторяет каждый символ в строке несколько раз
    public static String repeat(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= times; j++) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    // ищет максимум и минимум в массиве и возвращает их разность
    public static int differenceMaxMin(int[] array) {
        int min = (int) Math.pow(10, 9);
        int max = (int) Math.pow(-10, 9);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }

        }
        return max - min;
    }

    // проверяет является ли среднее значение целым числом
    public static boolean isAvgWhole(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum % array.length == 0);
    }

    // берет массив целых чисел и возвращает массив, в котором каждое
    // целое число является суммой самого себя + всех предыдущих чисел в массиве.
    public static int[] cumulativeSum(int[] array) {
        int sum = 0;
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            result[i] = sum;
        }
        return result;
    }

    // возвращает количество цифр после запятой
    public static int getDecimalPlaces(String number) {
        StringBuilder whole = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            whole.append(number.charAt(i));
            if (number.charAt(i) == '.') {
                break;
            }
        }
        return number.length() - whole.length();
    }

    // возвращает число из последовательности Фибоначчи
    public static int Fibonacci(int number) {
        if (number == 1) {
            return 1;
        } else if (number == 0) {
            return 0;
        } else {
            return Fibonacci(number - 1) + Fibonacci(number - 2);
        }
    }

    /*public static int Fibonacci2(int number) {
        int a = 1, b = 1, c;
        for (int i = 2; i <= number; i++) {
            c = a;
            a = b;
            b += c;
        }
        return a;
    }*/

    // проверяет действителен ли почтовый индекс
    public static boolean isValid(String index) {
        if (index.length() > 5) {
            return false;
        } else {
            for (int i = 0; i < index.length(); i++) {
                if (!Character.isDigit(index.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    // проверяет являются ли две строки странной парой
    public static boolean isStrangePair(String first, String second) {
        if (first.equals("") && second.equals("")){
            return true;
        }
        return first.charAt(0) == second.charAt(second.length() - 1) &&
               second.charAt(0) == first.charAt(first.length() - 1);
    }

    // проверяет является ли вторая строка префиксом первой
    public static boolean isPrefix(String word, String prefix) {
        for (int i = 0; i < prefix.length()-1; i++) {
            if (word.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // проверяет является ли вторая строка суффиксом первой
    public static boolean isSuffix(String word, String suffix) {
        for (int i = 1; i < suffix.length(); i++) {
            if (word.charAt(word.length()-i) != suffix.charAt(suffix.length()-i)) {
                return false;
            }
        }
        return true;
    }

    public static int boxSeq(int amount) {
        int result = 0;
        for (int i = 1; i <= amount; i++) {
            if (i % 2 == 1) {
                result += 3;
            } else {
                result -= 1;
            }
        }
        return result;
    }
}
