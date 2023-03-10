import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//    Level 1b. Реализуйте функцию, которая принимает на вход массив и число элементов,
//    и возвращает новый массив, который содержит все элементы исходного массива и заданное число новых элементов.

        int[] arr = new int[10];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) arr[i] = (random.nextInt(10, 100));

        arr = DynamicZoom.zoom(arr, 45);
        System.out.println(Arrays.toString(arr));
    }
}