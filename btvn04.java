package btvn04 ;

public class btvn04  {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.printf("Giá trị a: %d%n", a);
        System.out.printf("Giá trị b: %d%n", b);
        System.out.printf("Tổng của a và b: %d%n", sum);
        System.out.printf("Hiệu của a và b: %d%n", difference);
        System.out.printf("Tích của a và b: %d%n", product);
        System.out.printf("Thương của a chia cho b: %d%n", quotient);
        System.out.printf("Phần dư khi chia a cho b: %d%n", remainder);
    }
}

