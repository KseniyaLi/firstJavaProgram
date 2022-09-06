
public class CalcIfElse {






    public static void calc(double paramA, double paramB, char operation){
        if(operation == '+'){
            System.out.println(paramA + paramB);
        } else if (operation == '-') {
            System.out.println(paramA - paramB);
        } else if (operation == '*') {
            System.out.println(paramA * paramB);
        } else if (operation == '/') {
            System.out.println(paramA / paramB);
        } else {
            System.out.println("Incorrect type of operation");
        }
    }

    public static void main(String[] args) {
        calc(10, 7, '+');
        calc(10, 7, '-');
        calc(10, 7, '*');
        calc(10, 7, '/');
    }
}
