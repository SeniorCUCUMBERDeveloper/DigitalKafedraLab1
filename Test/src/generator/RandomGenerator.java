package generator;
import java.util.Random;

public class RandomGenerator {
    public static int generateNumber() {
        Random random = new Random();
        return random.nextInt(4) + 2; // nextInt(4) генерирует 0, 1, 2, 3;  +2 сдвигает диапазон
    }
}
