
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        final int start = 1, end = 100;
        HashMap<Integer, String> divisors = new HashMap<>();

        divisors.put(3, "Fizz");
        divisors.put(5, "Buzz");
        divisors.put(7, "Jazz");

        for (int i = start; i <= end; i++) {
            String result = "";

            for (Integer divisor : divisors.keySet()) {
                if (i % divisor == 0)
                    result += divisors.get(divisor);
            }
            if (result.isEmpty())
                result += i;

            System.out.println(result);
        }
    }
}