import java.util.Scanner;

public class IfPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите оплату:");
        double payment = input.nextDouble();
        System.out.println("Введите оценку:");
        double estimation = input.nextDouble();

        if (estimation > 90) {
            payment *= 1.03;
        } else {
            payment *= 1.01;
        }
        System.out.println("Оплата = " + payment);
    }
}
