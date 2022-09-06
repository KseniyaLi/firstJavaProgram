public class CalcSwitchCase {
    public static void calc(double paramA, double paramB, char operation){
        double result = 0;
        switch (operation){
            case '+':
                result = paramA + paramB;
                break;
            case '-':
                result = paramA - paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;
            case '/':
                result = paramA / paramB;
                break;
            default:
                System.out.println("Incorrect operation");
        }
        System.out.println("Результат операции" + operation + " = " + result);
    }

    public static void main(String[] args) {
        calc(10, 7, '+');
        calc(10, 7, '-');
        calc(10, 7, '*');
        calc(10, 7, '/');
    }
}


