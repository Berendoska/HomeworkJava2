
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;
import java.util.logging.Logger;


public class Main {
    private static final Logger logger = Logger.getGlobal();

    public static void main(String args[]) throws IOException {

        FileHandler fHand = new FileHandler("Loggi.txt");
        logger.addHandler(fHand);

        ConsoleHandler bub = new ConsoleHandler();
        logger.addHandler(bub);

        XMLFormatter xml = new XMLFormatter();
        bub.setFormatter(xml);


        logger.log(Level.WARNING, "warn", new Throwable());

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Случайный массив" + Arrays.toString(arr));
        int tmp;
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSort = false;
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;


                }


            }
        }
        System.out.println("Отсортированный случайный массив" + Arrays.toString(arr));
    }
}
