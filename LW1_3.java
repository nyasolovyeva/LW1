import java.util.Scanner;

class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phrase1 = "Введите основание степени x: ";
        System.out.println(phrase1);
        int num1 = sc.nextInt();
        int new_num1 = num1;
        float new_num1_2 = num1; // для отрицательных

        String phrase2 = "Введите степень n (-15 < n > 15): ";
        System.out.println(phrase2);
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println(1);
        } else {
            if (num2 > 0) {
                for (int i = 1; i < num2; i += 1) { // i - счётчик степени
                    new_num1 = new_num1 * num1;
                }
                System.out.println(new_num1);
            } else {
                num2 = -num2;// делаем из отрицательного числа положительное и решаем аналогично
                int i = 1;
                while (i < num2){
                    new_num1_2 = new_num1_2 * num1;
                    i+=1;
            }
                System.out.println(1 / new_num1_2);
            }
        }
    }
}

