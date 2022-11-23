import java.util.Scanner;

class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String year1 = "Введите год вашего рождения: ";
        System.out.println(year1);
        int year = sc.nextInt();

        String month1 = "Введите месяц вашего рождения: ";
        System.out.println(month1);
        int month = sc.nextInt();

        String day1 = "Введите день вашего рождения: ";
        System.out.println(day1);
        int day = sc.nextInt();

        if (year > 2022 || month > 12 || day > 31) {
            if (year > 2022) {
                System.out.println("Перепроверьте год вашего рождения.");
            }
            if (month > 12) {
                System.out.println("Перепроверьте месяц вашего рождения.");
            }
            if (day > 31) {
                System.out.println("Перепроверьте день вашего рождения.");
            }
        } else {
            System.out.println("Дата вашего рождения: " + day + "." + month + "." + year);

            int cur_year = 2022;
            int cur_month = 11;
            int cur_day = 25;
            System.out.println("Сегодняшняя дата: " + cur_day + "." + cur_month + "." + cur_year);

            int res_year, res_month, res_day;

            res_year = cur_year - year;
            if (cur_month < month) {
                res_year = res_year -1;
            }
            res_month = cur_month - month;
            if (res_month < 0) {
                res_month = res_month + 12;
            }
            res_day = cur_day - day;
            if (res_day < 0) {
                res_day = res_day + 30; //Если мы учитываем, что в месяце 30 дней
            }
            System.out .println (res_year + " лет," + res_month + " месяцев и " + res_day + " дней");
        }
    }
}
