import java.util.Arrays;

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
}
