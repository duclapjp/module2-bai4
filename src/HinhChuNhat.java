import java.util.Scanner;

public class HinhChuNhat {
    double width, height;

    public HinhChuNhat() {
    }
   public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

   public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public  String display() {
        return "Reactangle{" + "width=" + width + ",height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chieu rong");
        double width = scanner.nextDouble();
        System.out.println("nhap chieu cao");
        double height = scanner.nextDouble();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(width,height);
        System.out.println("your Rectangle"+hinhChuNhat.display());
        System.out.println("Perimeter of the Rectangle"+hinhChuNhat.getPerimeter());
        System.out.println("Area of the Rectangle"+hinhChuNhat.getArea());
    }
}
