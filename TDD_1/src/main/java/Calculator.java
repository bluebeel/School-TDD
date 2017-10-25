public class Calculator {

    public int Add(int a, int b) {
        return a + b;
    }

    public int Mult(int a, int b) {
        return a * b;
    }

    public int Sub(int a, int b) {
        return a - b;
    }

    public float Div(float a, float b) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        return a / b;
    }
}