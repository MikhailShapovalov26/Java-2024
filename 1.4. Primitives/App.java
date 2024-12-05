import java.util.Scanner;

public class App {
    public static int taxEarnings(int earnings) {
        return (earnings*6)/100;
    }
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выхода необходимо ввести слово 'end'");

        while (true) {
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            String input = scanner.nextLine();
            if ("end".equals(input)){
                break;
            } else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Введите доход: ");
                        String moneyStr = scanner.nextLine();
                        int money = Integer.parseInt(moneyStr);
                        earnings += money;
                        break;
                    case 2:
                        System.out.println("Введите расход: ");
                        String costStr = scanner.nextLine();
                        int cost = Integer.parseInt(costStr);
                        spendings += cost;
                        break;
                    case 3:
                        int taxResultUSN = taxEarnings(earnings);
                        int taxResultUSNMinus = taxEarningsMinusSpendings(earnings, spendings);
                        if (taxResultUSN < taxResultUSNMinus){
                            System.out.println("Мы советуем вам УСН доходы");
                            System.out.printf("Ваш налог составит: %s рублей%n", taxResultUSN);
                            System.out.printf("Налог по другой системе составляет %s рублей%n", taxResultUSNMinus);
                            System.out.println("Экономия "+ (taxResultUSNMinus - taxResultUSN) + " рублей");
                            System.out.println();
                        } else {
                            System.out.println("Мы советуем вам УСН доходы минус расходы");
                            System.out.printf("Ваш налог составит: %s рублей%n", taxResultUSNMinus);
                            System.out.printf("Налог по другой системе составляет %s рублей%n", taxResultUSN);
                            System.out.println("Экономия "+ (taxResultUSN - taxResultUSNMinus) + " рублей");
                            System.out.println();
                        }
                        break;
                    default:
                        System.out.println("Такой операции нет");

                }
            }

        }
    }
}
