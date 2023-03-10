@SuppressWarnings("ALL")
public class DynamicZoom {
    public static int[] zoom(int[] array, int elements) {
        int newSize = array.length + elements;
        int[] biggerArray = new int[newSize];

        System.arraycopy(array, 0, biggerArray, 0, array.length);

        return biggerArray;
    }
}
