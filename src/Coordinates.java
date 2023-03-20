public class Coordinates {
    public static void main(String[] args) {
        double width = (int)(Math.random() * (51 - (-50))) + (-50);
        double height = (int)(Math.random() * (101 - (-100))) + (-100);
        System.out.println("Ширина " + width + " , высота " + height);
    }
}
