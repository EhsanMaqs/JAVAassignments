public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for(int number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
    }
}
