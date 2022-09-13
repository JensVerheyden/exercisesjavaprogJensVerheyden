public class AverageOfIntegers {

    public static void main(String[] args) {
        int[] integerArray = {5, 5, 5, 5};

        int sumOfIntegers = 0;

        for (int i : integerArray) {
            sumOfIntegers = sumOfIntegers + i;
        }

        System.out.println(sumOfIntegers/integerArray.length);
    }
}
