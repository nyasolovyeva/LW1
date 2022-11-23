import java.util.Scanner;

class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month1 = "Введите месяц: ";
        System.out.println(month1);
        int month = sc.nextInt();

        String day1 = "Введите день: ";
        System.out.println(day1);
        int day = sc.nextInt();

        if (month > 12 || day > 31) {

            if (month > 12) {
                System.out.println("Перепроверьте месяц.");
            }
            if (day > 31) {
                System.out.println("Перепроверьте день.");
            }
        } else {
            System.out.println("Дата:" + day + "." + month);
        }
        if (month == 9 || month == 10 || month == 11 ) {
                System.out.println("Осень");
            }
        if (month == 12 || month == 1 || month == 2 ) {
            System.out.println("Зима");
        }
        if (month == 3 || month == 4 || month == 5 ) {
            System.out.println("Весна");
        }
        if (month == 6 || month == 7 || month == 8 ) {
            System.out.println("Лето");
        }
    }
}
