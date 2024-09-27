import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh thu nhat: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap canh thu hai: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap canh thu ba: ");
        double c = scanner.nextDouble();
        if (isTriangle(a, b, c)) {
            String triangleType = getTriangleType(a, b, c);
            System.out.println("Ba canh nay tao thanh mot tam giac " + triangleType);
        } else {
            System.out.println("Ba canh nay khong tao thanh tam giac.");
        }
    }
    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    public static String getTriangleType(double a, double b, double c) {
        if (a == b && b == c) {
            return "deu";
        } else if (a == b || b == c || a == c) {
            return "can";
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "vuong";
        } else {
            return "thuong";
        }
    }
}
