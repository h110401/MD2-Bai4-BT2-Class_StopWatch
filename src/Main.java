public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();

        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000) + 1;
        }

        watch.start();
        selectionSort(numbers);
        watch.stop();
        System.out.println(watch.getElapsedTime() + " milliseconds");

    }

    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }
}