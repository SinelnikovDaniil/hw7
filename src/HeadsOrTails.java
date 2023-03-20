import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Орел или решка? \nОрел - 0 , Решка - 1");
        int headsOrTails = input.nextInt();
        double coin = (int)(Math.random() * 2);

        if (headsOrTails == 0 && coin == 0) {
            System.out.println("Выпал орел. Ты победил!!");
        } else if (headsOrTails == 0 && coin == 1) {
            System.out.println("Выпала решка. Ты проиграл :(");
        } else if (headsOrTails == 1 && coin == 0) {
            System.out.println("Выпал орел. Ты проиграл :(");
        } else if (headsOrTails == 1 && coin == 1) {
            System.out.println("Выпала решка. Ты победил!!");
        }

    }
}
