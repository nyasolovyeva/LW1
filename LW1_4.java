import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N1 = "Введите количество точек: ";
        System.out.println(N1);
        int N = sc.nextInt();

        String R1 = "Введите длину радиуса: ";
        System.out.println(R1);
        int R = sc.nextInt();

        int k = 0;
        for (int i = 1; i <= N; i+=1) {
            String x1 = "Введите координату x" + i + ":";
            System.out.println(x1);
            float x = sc.nextFloat();

            String y1 = "Введите координату y" + i + ":";
            System.out.println(y1);
            float y = sc.nextFloat();

            if ((Math.sqrt(x*x + y*y)) <= R){
                k+=1;
            }
        }
System.out.print(k);
        }
}

