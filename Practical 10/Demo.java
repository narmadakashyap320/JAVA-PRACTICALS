import java.util.Scanner;

public class BeanAdditionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AdditionBean obj = new AdditionBean();

        System.out.print("Enter first number: ");
        obj.setA(sc.nextInt());

        System.out.print("Enter second number: ");
        obj.setB(sc.nextInt());

        System.out.println("Sum = " + obj.getSum());

        sc.close();
    }
}
