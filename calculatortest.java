import java.util.ArrayList;
import java.util.List;

public class calculatortest {
    public static void testCalculate() {
    List<Float> numbers = new ArrayList<>();
    numbers.add(2.0f);
    numbers.add(3.0f);
    numbers.add(4.0f);

    List<String> operations = new ArrayList<>();
    operations.add("+");
    operations.add("-");

    Calculator.Calculate(numbers, operations);
    float expected = 1.0f;
    assert Calculator.finalResult == expected : "testCalculate: FAILED";
}
}
