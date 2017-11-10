package calc;

public interface CalculatorMBean {
    int getFirstNumber();

    void setFirstNumber(int firstNumber);

    int getSecondNumber();

    void setSecondNumber(int secondNumber);

    int add();

    @Override
    String toString();
}
